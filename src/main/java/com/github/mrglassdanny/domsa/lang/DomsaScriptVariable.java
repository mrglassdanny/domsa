package com.github.mrglassdanny.domsa.lang;

public class DomsaScriptVariable {


    public DomsaScriptType typ;
    public Object data;

    public DomsaScriptVariable(DomsaScriptType typ, Object data) {
        this.typ = typ;
        this.data = data;
    }

    private static DomsaScriptType inferType(DomsaScriptVariable v) {

        if (v.typ != DomsaScriptType.Unknown)
            return v.typ;

        if (v.data == null)
            return DomsaScriptType.Unknown;

        String dataStr = (String)v.data;

        if (dataStr.isEmpty()) {
            return DomsaScriptType.String;
        } else {
            if (dataStr.equals("true") || dataStr.equals("false")) {
                return DomsaScriptType.Boolean;
            }

            try {
                Double.parseDouble(dataStr);
                return DomsaScriptType.Number;
            } catch (Exception e) {
                return DomsaScriptType.String;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof DomsaScriptVariable)) {
            return false;
        }

        return this.compare((DomsaScriptVariable)o) == 0;
    }

    public int compare(DomsaScriptVariable o) {

        if (this.data == null) {
            if (o.data == null) {
                return 0;
            } else {
                return -1;
            }
        } else if(o.data == null) {
            return 1;
        }

        var my_typ = inferType(this);
        var their_typ = inferType(o);

        if (my_typ != their_typ) {
            // TODO: throw exception
        }

        switch(this.typ) {
            case Boolean:
            {
                Boolean a = (Boolean)this.data;
                Boolean b = (Boolean)o.data;
                return Boolean.compare(a, b);
            }
            case Number:
            {
                Double a = (Double)this.data;
                Double b = (Double)o.data;
                return Double.compare(a, b);
            }
            default:
            {
                String a = (String)this.data;
                String b = (String)o.data;
                return a.compareTo(b);
            }
        }
    }

    public void add(DomsaScriptVariable o) {
        var my_typ = inferType(this);
        var their_typ = inferType(o);

        if (my_typ != their_typ) {
            // TODO: throw exception
        }

        switch (my_typ) {
            case Boolean:
            {
                Boolean a = (Boolean)this.data;
                Boolean b = (Boolean)o.data;
                this.data = (a ? 1 : 0) + (b ? 1 : 0);
            }
            break;
            case Number:
            {
                Double a = (Double)this.data;
                Double b = (Double)o.data;
                this.data = a + b;
            }
            break;
            default:
                // TODO
                this.data = null;
                break;
        }
    }

    public void sub(DomsaScriptVariable o) {
        var my_typ = inferType(this);
        var their_typ = inferType(o);

        if (my_typ != their_typ) {
            // TODO: throw exception
        }

        switch (my_typ) {
            case Boolean:
            {
                Boolean a = (Boolean)this.data;
                Boolean b = (Boolean)o.data;
                this.data = (a ? 1 : 0) - (b ? 1 : 0);
            }
            break;
            case Number:
            {
                Double a = (Double)this.data;
                Double b = (Double)o.data;
                this.data = a - b;
            }
            break;
            default:
                // TODO
                this.data = null;
                break;

        }
    }

    public void mul(DomsaScriptVariable o) {
        var my_typ = inferType(this);
        var their_typ = inferType(o);

        if (my_typ != their_typ) {
            // TODO: throw exception
        }

        switch (my_typ) {
            case Boolean:
            {
                Boolean a = (Boolean)this.data;
                Boolean b = (Boolean)o.data;
                this.data = (a ? 1 : 0) * (b ? 1 : 0);
            }
            break;
            case Number:
            {
                Double a = (Double)this.data;
                Double b = (Double)o.data;
                this.data = a * b;
            }
            break;
            default:
                // TODO
                this.data = null;
                break;
        }
    }

    public void div(DomsaScriptVariable o) {
        var my_typ = inferType(this);
        var their_typ = inferType(o);

        if (my_typ != their_typ) {
            // TODO: throw exception
        }

        switch (my_typ) {
            case Boolean:
            {
                Boolean a = (Boolean)this.data;
                Boolean b = (Boolean)o.data;
                this.data = (a ? 1 : 0) / (b ? 1 : 0);
            }
            break;
            case Number:
            {
                Double a = (Double)this.data;
                Double b = (Double)o.data;
                this.data = a / b;
            }
            break;
            default:
                // TODO
                this.data = null;
                break;
        }
    }

    public void mod(DomsaScriptVariable o) {
        var my_typ = inferType(this);
        var their_typ = inferType(o);

        if (my_typ != their_typ) {
            // TODO: throw exception
        }

        switch (my_typ) {
            case Boolean:
            {
                Boolean a = (Boolean)this.data;
                Boolean b = (Boolean)o.data;
                this.data = (a ? 1 : 0) % (b ? 1 : 0);
            }
            break;
            case Number:
            {
                Double a = (Double)this.data;
                Double b = (Double)o.data;
                this.data = a % b;
            }
            break;
            default:
                // TODO
                this.data = null;
                break;
        }
    }
}
