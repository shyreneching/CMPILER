
import gen.ErrorListener;
import gen.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromFileName("input/test2.cpp");
            PseudoLexer lexer = new PseudoLexer(input);
            PseudoParser parser = new PseudoParser(new CommonTokenStream(lexer));
            lexer.removeErrorListeners();
            parser.removeErrorListeners();
            lexer.addErrorListener(ErrorListener.INSTANCE);
            parser.addErrorListener(ErrorListener.INSTANCE);
            //parser.setErrorHandler(new ErrorRecovery());
//            parser.addErrorListener(new ErrorListener());
            parser.addParseListener(new PseudoParserBaseListener());
            parser.translationUnit();
            System.out.println(ErrorListener.INSTANCE.toString());
        } catch (IOException ex) {
            //System.out.println(ex);
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
