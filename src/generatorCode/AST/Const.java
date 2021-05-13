package generatorCode.AST;

import generatorCode.compiler.ASMCompiler;
import org.objectweb.asm.Opcodes;
import symbols.Type;

public class Const extends Expr {
    public Const(String s, Type t) { super(s, t); }
    public static final Const
            True  = new Const("true", Type.Bool),
            False = new Const("false", Type.Bool);
    public void genJVM() {
        Type p = type;
        if (Type.Int.equals(p)) {
            int i = Integer.parseInt(op.toString());
            if (Math.abs(i) >= 128) {
                ASMCompiler.mv.visitIntInsn(Opcodes.SIPUSH, i);
            } else {
                ASMCompiler.mv.visitIntInsn(Opcodes.BIPUSH, i);
            }
        } else if (Type.Float.equals(p)) {
            ASMCompiler.mv.visitLdcInsn(Float.parseFloat(op.toString()));
        } else if (Type.Char.equals(p)) {
            ASMCompiler.mv.visitIntInsn(Opcodes.BIPUSH, (int)(op.toString().charAt(0)));
        } else if (Type.Bool.equals(p)) {
            if (Boolean.parseBoolean(op.toString())) ASMCompiler.mv.visitInsn(Opcodes.ICONST_1);
            else ASMCompiler.mv.visitInsn(Opcodes.ICONST_0);
        }
    }
}
