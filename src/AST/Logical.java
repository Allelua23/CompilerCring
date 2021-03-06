package generatorCode.AST;

import symbols.Type;

// общая функциональность для And и Or
public class Logical extends Expr {
    public Expr expr1, expr2;
    Logical(String s, Expr x1, Expr x2) {
        super(s, null); // для начала нудевой тип
        expr1 = x1; expr2 = x2;
        type = check(expr1.type, expr2.type);
        if (type == null) error("type error");
    }
    public Type check(Type p1, Type p2) {
        if (p1 == Type.Bool && p2 == Type.Bool) return Type.Bool;
        else return null;
    }
    public String toString() { return expr1.toString()+" "+ op +" "+expr2.toString(); }
    public void genJVM() {
        System.out.println("OP!: " + expr1.op);
        System.out.println("OP!: " + expr2.op);
        if (expr1 != null) expr1.genJVM();
        if (expr2 != null) expr2.genJVM();
    }
}
