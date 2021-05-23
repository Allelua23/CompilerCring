package generatorCode.AST;

public class Break extends Stmt {
    Stmt stmt;
    public Break() {
        if (Stmt.Enclosing == null)
            error("unenclosed break");
        stmt = Stmt.Enclosing;
    }
    public void genJVM() {
        stmt.genJVM();
        //emit( "goto L" + stmt.after);
    }
}
