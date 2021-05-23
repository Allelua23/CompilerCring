package generatorCode.AST;

import symbols.Type;

public class ObjConst extends Stmt {
    public String varName;
    public String value;
    public Type type;
    public String getVarName() { return varName; }
    public String getValue() { return value; }
    public Type getType() { return type; }
    // Expr expr;
    public ObjConst(String varName, Type type, String value) {
        this.varName = varName; this.type = type; this.value = value;
    }
}
