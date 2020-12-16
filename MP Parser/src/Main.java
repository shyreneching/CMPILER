import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromFileName("input/test2.java");
            PseudoCodeLexer lexer = new PseudoCodeLexer(input);
            PseudoCodeParser parser = new PseudoCodeParser(new CommonTokenStream(lexer));
            lexer.removeErrorListeners();
            parser.removeErrorListeners();
            lexer.addErrorListener(ErrorListener.INSTANCE);
            parser.addErrorListener(ErrorListener.INSTANCE);
            //parser.setErrorHandler(new ErrorRecovery());
//            parser.addErrorListener(new ErrorListener());
            parser.addParseListener(new PseudoCodeBaseListener());
            parser.compilationUnit();
            System.out.println(ErrorListener.INSTANCE.toString());
        } catch (IOException ex) {
            //System.out.println(ex);
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
