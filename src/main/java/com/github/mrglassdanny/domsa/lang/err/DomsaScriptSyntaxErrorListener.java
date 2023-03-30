package com.github.mrglassdanny.domsa.lang.err;

import com.github.mrglassdanny.domsa.lang.err.DomsaScriptSyntaxError;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;

public class DomsaScriptSyntaxErrorListener extends BaseErrorListener {

    public ArrayList<DomsaScriptSyntaxError> syntaxErrors;

    public DomsaScriptSyntaxErrorListener() {
        this.syntaxErrors = new ArrayList<>();
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                            String msg, RecognitionException e) {
        this.syntaxErrors.add(new DomsaScriptSyntaxError(line, charPositionInLine, msg));
    }
}
