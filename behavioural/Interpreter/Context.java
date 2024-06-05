package behavioural.Interpreter;

import java.util.HashMap;

class Context {
    private HashMap varList = new HashMap();

    public void assign(String var, int value) {
        varList.put(var, value);
    }

    public int getValue(String var) {
        Integer objInt = (Integer) varList.get(var);
        return objInt.intValue();
    }

    public Context() {
        initialize();
    }

    //Values are hardcoded to keep the example simple

    //File: Interprepter.properties
/*
a=10
b=20
c=30
d=40

*/
    private void initialize() {
        assign("a", 20);
        assign("b", 40);
        assign("c", 30);
        assign("d", 10);
    }

}
