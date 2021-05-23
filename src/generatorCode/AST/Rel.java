package generatorCode.AST;

import generatorCode.compiler.ASMCompiler;
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import symbols.Type;

public class Rel extends Logical {
    public Rel(String s, Expr x1, Expr x2) { super(s, x1, x2); }
    public Type check(Type p1, Type p2) {
        if( p1 == p2 ) return Type.Bool;
        else return null;
    }
    public void genJVM() {
        expr1.genJVM();
        expr2.genJVM();
        Label endLabel = new Label();
        Label trueLabel = new Label();
        switch (op) {
            case ">":
                ASMCompiler.mv.visitJumpInsn(Opcodes.IF_ICMPGE, trueLabel);
                break;
            case "<":
                ASMCompiler.mv.visitJumpInsn(Opcodes.IF_ICMPLE, trueLabel);
                break;
            case "==":
                ASMCompiler.mv.visitJumpInsn(Opcodes.IF_ICMPEQ, trueLabel);
                break;
            case ">=":
                ASMCompiler.mv.visitJumpInsn(Opcodes.IF_ICMPGT, trueLabel);
                break;
            case "<=":
                ASMCompiler.mv.visitJumpInsn(Opcodes.IF_ICMPLT, trueLabel);
                break;
        }
        ASMCompiler.mv.visitInsn(Opcodes.ICONST_0);
        ASMCompiler.mv.visitJumpInsn(Opcodes.GOTO, endLabel);
        ASMCompiler.mv.visitLabel(trueLabel);
        ASMCompiler.mv.visitInsn(Opcodes.ICONST_1);
        ASMCompiler.mv.visitLabel(endLabel);
    }
}
