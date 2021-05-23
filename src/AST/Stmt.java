package generatorCode.AST;

// реализует конструкцию подклассами Stmt
public class Stmt extends Node {
    public Stmt() {}
    public static Stmt Null = new Stmt();
    /* вызывается с метками начала и после конструкции
    public void gen(int b, int a) {}
    // используется для инструкций break
    int after = 0;*/
    public static Stmt Enclosing = Stmt.Null;
    public void genJVM() {}
}
