package generatorCode.AST;

import generatorCode.compiler.ASMCompiler;
import org.objectweb.asm.Opcodes;
import symbols.Type;

public class TypeLiteral extends Expr {
    public TypeLiteral(String s, Type t) { super(s, t); }
    public static final TypeLiteral
            True  = new TypeLiteral("true", Type.Bool),
            False = new TypeLiteral("false", Type.Bool);
    public void genJVM() {
        Type p = type;
        if (Type.Int.equals(p)) {
            int i = Integer.parseInt(op);
            if (Math.abs(i) >= 128) {
                ASMCompiler.mv.visitIntInsn(Opcodes.SIPUSH, i);
            } else {
                ASMCompiler.mv.visitIntInsn(Opcodes.BIPUSH, i);
            }
        } else if (Type.Float.equals(p)) {
            ASMCompiler.mv.visitLdcInsn(Float.parseFloat(op));
        } else if (Type.Char.equals(p)) {
            ASMCompiler.mv.visitIntInsn(Opcodes.BIPUSH, op.charAt(0));
        } else if (Type.Bool.equals(p)) {
            if (Boolean.parseBoolean(op)) ASMCompiler.mv.visitInsn(Opcodes.ICONST_1);
            else ASMCompiler.mv.visitInsn(Opcodes.ICONST_0);
        }
    }
}
