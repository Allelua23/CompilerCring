package generatorCode.AST;

import generatorCode.compiler.ASMCompiler;
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import symbols.Type;

public class If extends Stmt {
    Expr expr; Stmt stmt;
    public If(Expr x, Stmt s) {
        expr = x;  stmt = s;
        if( expr.type != Type.Bool ) expr.error("boolean required in if");
    }
    public void genJVM() {
        expr.genJVM();
        Label trueLabel = new Label();
        Label endLabel = new Label();
        ASMCompiler.mv.visitJumpInsn(Opcodes.IFNE, trueLabel);
        ASMCompiler.mv.visitJumpInsn(Opcodes.GOTO, endLabel);
        ASMCompiler.mv.visitLabel(trueLabel);
        stmt.genJVM();
        ASMCompiler.mv.visitLabel(endLabel);
    }
}
