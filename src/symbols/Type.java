package symbols;

public class Type {
    String type;
    public int width = 0;   // Используется при выделении памяти
    public Type(String s, int w) { type = s; width = w; }
    public static final Type
            Int     = new Type("int",   4),
            Char    = new Type("char",  1),
            Float   = new Type("float", 8),
            Bool    = new Type("bool",  1);
    public static Type getType(String s) {
        switch (s) {
            case "int":
                return Int;
            case "char":
                return Char;
            case "float":
                return Float;
            case "bool":
                return Bool;
        }
        return null;
    }
    public static boolean numeric(Type p) {
        if (p == Type.Char || p == Type.Int || p == Type.Float) return true;
        else return false;
    }
    public static Type max(Type p1, Type p2) {
        if (! numeric(p1) || ! numeric(p2)) return null;
        else if (p1 == Type.Float || p2 == Type.Float) return Type.Float;
        else if (p1 == Type.Int  || p2 == Type.Int ) return Type.Int;
        else return Type.Char;
    }
}
