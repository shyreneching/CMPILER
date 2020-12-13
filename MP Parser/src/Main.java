import gen.JavaCustomListener;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import gen.JavaLexer;
import gen.JavaParser;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        try {
            CharStream input = (CharStream) new ANTLRFileStream("input/test.txt");
            JavaLexer lexer = new JavaLexer(input);
            JavaParser parser = new JavaParser(new CommonTokenStream(lexer));
            parser.addParseListener(new JavaCustomListener());
            parser.classDeclaration();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
//    public static void main(String[] args) throws IOException {
//        CharStream input = (CharStream) new ANTLRFileStream("/input/test.txt");
//        JavaLexer lexer = new JavaLexer(input);
//        JavaParser parser = new JavaParser(new CommonTokenStream(lexer));
//        parser.addParseListener(new JavaCustomListener());
//        parser.enterClassDeclaration();
//        System.out.println(parser);
//        String name = parser.compilationUnit().getText();
//        System.out.println(name);
//    }
}
