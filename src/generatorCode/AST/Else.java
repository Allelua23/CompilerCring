package generatorCode.AST;

import generatorCode.compiler.ASMCompiler;
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import symbols.Type;

public class Else extends Stmt {
    Expr expr; Stmt stmt1, stmt2;
    public Else(Expr x, Stmt s1, Stmt s2) {
        expr = x; stmt1 = s1; stmt2 = s2;
        if( expr.type != Type.Bool ) expr.error("boolean required in if");
    }
    public void genJVM(){
        expr.genJVM();
        Label trueLabel = new Label();
        Label endLabel = new Label();
        ASMCompiler.mv.visitJumpInsn(Opcodes.IFNE, trueLabel);
        stmt2.genJVM();
        ASMCompiler.mv.visitJumpInsn(Opcodes.GOTO, endLabel);
        ASMCompiler.mv.visitLabel(trueLabel);
        stmt1.genJVM();
        ASMCompiler.mv.visitLabel(endLabel);
    }
}
