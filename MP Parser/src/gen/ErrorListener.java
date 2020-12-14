package gen;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
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

        if (msg.contains("extraneous")){
            temp = msg.split("'");
            System.out.println(temp[1]);
            if (temp[1].equals(")")){
                msg = "uneven parentheses, missing one '(' for ')'";
            } else if(temp[1].equals("(")){
                msg = "uneven parentheses, missing one ')' for '('";
            }
        } else if (msg.contains("missing")){
            temp = msg.split("'");
            System.out.println(temp[1]);
            if (msg.contains("++")){
                msg = "double '+' in arithmetic expression";
            }
        }



        //System.err.println(msg+ ", line "+line+":"+charPositionInLine+" in file: "+ sourceName);
        errorMsg = errorMsg + "\n" + msg+ ", line "+line+":"+charPositionInLine+" in file: "+ sourceName;
    }

    @Override
    public String toString() {
        return errorMsg;
    }
//    @Override public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e){
////        System.out.println("Entering here");
////        System.out.println("recognizer:" + recognizer);
////        System.out.println("offendingSymbol:" + offendingSymbol.toString());
////        System.out.println("line:" + line);
////        System.out.println("charPositionInLine:" + charPositionInLine);
//          System.out.println("msg:" + msg);
////        System.out.println("e:" + e);
//
//        String temp = msg;
//        if (temp.contains("missing")){
//            int i = temp.indexOf("missing") + 9;
//            System.out.println(temp.charAt(i));
//
//            System.out.println("At line: " + line + " you seem to be missing a '"+ temp.charAt(i)+ "' on the character position: "+  charPositionInLine);
//            msg = "At line: " + line + " you seem to be missing a '"+ temp.charAt(i)+ "' on the character position: "+  charPositionInLine;
//        }
//
//    }
}

