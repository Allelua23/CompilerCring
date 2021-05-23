package generatorCode.AST;

import generatorCode.compiler.ASMCompiler;
import org.objectweb.asm.Opcodes;
import symbols.*;

// класс идентификатора
public class Id extends Expr {
    String name;
    public int offset;   //относительный адрес
    public Id(String id, Type p, int b) { super(id, p); offset = b; }
    /*public String getName() { return name; }
    public double getValue() { return getValue(); }
    public String getType() { return getType(); }
    public String toString() { return String.format(" ", getName(), getType(), getValue()); }*/

    public void genJVM() {
        if (Type.Int.equals(type) || Type.Bool.equals(type) || Type.Char.equals(type)) {
            ASMCompiler.mv.visitIntInsn(Opcodes.ILOAD, offset);
        } else if (Type.Float.equals(type)) {
            ASMCompiler.mv.visitIntInsn(Opcodes.FLOAD, offset);
        }
    }
}
