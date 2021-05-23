package generatorCode.AST;

public class Continue extends Stmt {
    Stmt stmt;
    public Continue() {
        if (Stmt.Enclosing != null)
            error("unenclosed continue");
        stmt = Stmt.Enclosing;
    }
    public void genJVM() {}
}
