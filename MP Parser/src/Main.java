import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import gen.JavaLexer;
import gen.JavaParser;

public class Main {
    public static void main(String[] args){
        JavaLexer lexer = new JavaLexer(CharStreams.fromString("int"));
        JavaParser parser = new JavaParser(new CommonTokenStream(lexer));

        String name = parser.primitiveType().getText();
        System.out.println(name);
    }
}
