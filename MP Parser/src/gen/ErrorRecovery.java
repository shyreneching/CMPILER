package gen;

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.NoViableAltException;

public class ErrorRecovery  extends BailErrorStrategy {
    @Override public void recover(org.antlr.v4.runtime.Parser recognizer, org.antlr.v4.runtime.RecognitionException e) throws NoViableAltException {
//        //super.recover(recognizer, e);
//        CommonTokenStream tokens = (CommonTokenStream) recognizer.getTokenStream(); // verify current token is not EOF
//        if (tokens.LA(1) != JavaParser.EOF) { // move to next token
//            tokens.consume();
//        }
    }
}
