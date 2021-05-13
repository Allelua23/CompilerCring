package generatorCode.AST;

import generatorCode.compiler.ASMCompiler;
import org.objectweb.asm.Opcodes;
import symbols.*;

public class Id extends Expr {
    public int offset;   //относительный адрес
    public Id(String id, Type p, int b) { super(id, p); offset = b; }
    public void genJVM() {
        if (Type.Int.equals(type) || Type.Bool.equals(type) || Type.Char.equals(type)) {
            ASMCompiler.mv.visitIntInsn(Opcodes.ILOAD, offset);
        } else if (Type.Float.equals(type)) {
            ASMCompiler.mv.visitIntInsn(Opcodes.FLOAD, offset);
        }
    }
}
