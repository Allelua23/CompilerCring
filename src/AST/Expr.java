package generatorCode.AST;

import symbols.*;

// класс для узлов, представляющих выражения
// реализует конструкции выражений
public class Expr extends Node {
    public String op;
    public Type type;
    Expr(String s, Type t) { op = s; type = t; }
    //public Expr reduce() { return this; }
    /*public void jumping(int t, int f) { emitjumps(toString(), t, f); }
    public void emitjumps(String test, int t, int f) {
        if (t != 0 && f != 0) {
            emit("if " + test + " goto L" + t);
            emit("goto L" + f);
        }
        else if (t != 0)
            emit("if " + test + " goto L" + t);
        else if (f != 0)
            emit("if false " + test + " goto L" + f);
        else; // Ничего: и t, и f неуспешны
        // (nothing since both t and f fall through)
    }*/
    public String toString() { return op; }
    public void genJVM() {}
}
