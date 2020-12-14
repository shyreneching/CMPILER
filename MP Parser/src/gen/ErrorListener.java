package gen;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ErrorListener extends BaseErrorListener {
    public static ErrorListener INSTANCE = new ErrorListener();
    private static final boolean REPORT_SYNTAX_ERRORS = true;

    private String errorMsg = "";

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException re) {

        if (!REPORT_SYNTAX_ERRORS) {
            return;
        }

        String sourceName = recognizer.getInputStream().getSourceName();
        if (!sourceName.isEmpty()) {
            sourceName = String.format("%s; ", sourceName);
        }
        String[] temp;
        String[] unnanType = {"boolean;", "byte;", "short;", "int;", "long;", "char;", "float;", "double;", "String;", "Object;"};
        if (msg.contains("extraneous")){
            temp = msg.split("'");
//            System.out.println(temp[1]);
            if (msg.contains("'++' expecting ';'")){
                msg = "redundant '+' in arithmetic expression";
            } else if (msg.contains("input ';' expecting")){
                msg = "lacking argument before ';'";
            } else if (temp[1].equals(")")){
                msg = "uneven parentheses, missing one '(' for ')'";
            } else if(temp[1].equals("(")){
                msg = "uneven parentheses, missing one ')' for '('";
            }
        }
        else if (msg.contains("missing")){
            temp = msg.split("'");
//            System.out.println(temp[1]);
            if (msg.contains("++")){
                msg = "irrelevant '++' in arithmetic expression";
            }
        }
        else {
            if (Arrays.stream(unnanType).anyMatch(msg::contains)){
                temp = msg.split("'");
                System.out.println("temp[1]  "+temp[1]);
                msg = "no identifier found for '" + temp[1].replace(";", "") + "' data type";

            }
        }



        //System.err.println(msg+ ", line "+line+":"+charPositionInLine+" in file: "+ sourceName);
        errorMsg = errorMsg + "\n" + msg+ ", line "+line+":"+charPositionInLine+" in file: "+ sourceName;
    }

    @Override
    public String toString() {
        return errorMsg;
    }
    @Override public void reportAmbiguity(org.antlr.v4.runtime.Parser recognizer, org.antlr.v4.runtime.dfa.DFA dfa, int startIndex, int stopIndex, boolean exact, java.util.BitSet ambigAlts, org.antlr.v4.runtime.atn.ATNConfigSet configs) {
        System.out.println("Hello ambiguity");
    }

    @Override public void reportAttemptingFullContext(org.antlr.v4.runtime.Parser recognizer, org.antlr.v4.runtime.dfa.DFA dfa, int startIndex, int stopIndex, java.util.BitSet conflictingAlts, org.antlr.v4.runtime.atn.ATNConfigSet configs) { /* compiled code */ }

    @Override public void reportContextSensitivity(org.antlr.v4.runtime.Parser recognizer, org.antlr.v4.runtime.dfa.DFA dfa, int startIndex, int stopIndex, int prediction, org.antlr.v4.runtime.atn.ATNConfigSet configs) { System.out.println("Hello reportContextSensitivity"); }
}

