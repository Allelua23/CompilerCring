package generatorCode.AST;

import symbols.Symbol;

import java.util.function.DoubleFunction;

public class Function extends Symbol {
    /*public TypeNode typeNode = null;
    public String name;*/
    private DoubleFunction<Double> theFunc;
    public Function(String name, DoubleFunction<Double> lambda) {
        super(name);
        theFunc = lambda;
    }

    @Override
    public double getValue(double x) { return theFunc.apply(x); }
    public String getType() { return "FUNC"; }
}
