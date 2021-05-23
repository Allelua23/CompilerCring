package generatorCode.AST;

// реализовывает узлы в синтаксическом дереве как объекты
public class Node {
    int lexline = 0;
    Node() {}
    Node(int i) { lexline = i; }
    void error(String s) { throw new Error("near line " + lexline + " ? " + ": " + s); }
    static int labels = 0;
    /*public int newlabel() { return ++labels; }
    public void emitlabel(int i) {
        System.out.print("L" + i + ":"); }*/
    public void emit(String s) {
        System.out.println("\t" + s); }
}
