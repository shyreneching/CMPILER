
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ErrorRecovery  extends BailErrorStrategy {
    @Override public void recover(org.antlr.v4.runtime.Parser recognizer, org.antlr.v4.runtime.RecognitionException e) throws NoViableAltException {
        super.recover(recognizer, e);
        CommonTokenStream tokens = (CommonTokenStream) recognizer.getTokenStream();
        // verify current token is not EOF
        if (tokens.LA(1) != PseudoCodeParser.EOF) {
            // move to next token
            tokens.consume();
        }
    }
    @Override
    public org.antlr.v4.runtime.Token recoverInline(Parser recognizer) throws RecognitionException {
        throw new RuntimeException(new InputMismatchException(recognizer));
    }
}
