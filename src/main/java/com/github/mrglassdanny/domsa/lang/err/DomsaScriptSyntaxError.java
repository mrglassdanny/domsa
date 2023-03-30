package com.github.mrglassdanny.domsa.lang.err;

public class DomsaScriptSyntaxError {
    public int line;
    public int charPositionInLine;
    public String msg;

    public DomsaScriptSyntaxError(int line, int charPositionInLine, String msg) {
        this.line = line;
        this.charPositionInLine = charPositionInLine;
        this.msg = msg;
    }
}
