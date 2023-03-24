package com.github.mrglassdanny.domsa.lang;

public class DomsaScriptVariable {

    public DomsaScriptType typ;
    public Object data;

    public DomsaScriptVariable(DomsaScriptType typ, Object data) {
        this.typ = typ;
        this.data = data;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;

        if (!(other instanceof DomsaScriptVariable)) {
            return false;
        }

        var otherDomsaVar = (DomsaScriptVariable)other;
        return this.typ.equals(otherDomsaVar.typ) &&
                this.data.equals(otherDomsaVar.data);

    }

}
