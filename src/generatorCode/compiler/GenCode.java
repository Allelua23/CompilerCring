package generatorCode.compiler;

import generatorCode.AST.Expr;
import generatorCode.AST.Stmt;
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;

public class GenCode implements Opcodes {
    Expr expr;
    Stmt stmt;

    public void genWhile() {
        Label startCicle = new Label();
        Label endCicle = new Label();
        Label statments = new Label();
        ASMCompiler.mv.visitLabel(startCicle);
        //after = a;
        //expr.jumping(0, a);
        expr.genJVM();
        /*int i = -1;
        switch (opcode) {
            case Opcodes.IFEQ: i = Opcodes.IFNE;
                break;
            case Opcodes.IFNE: i = Opcodes.IFEQ;
                break;

        }*/
        ASMCompiler.mv.visitJumpInsn(IFNE, statments);
        ASMCompiler.mv.visitJumpInsn(GOTO, endCicle);
        ASMCompiler.mv.visitLabel(statments);
        stmt.genJVM();
        ASMCompiler.mv.visitJumpInsn(GOTO, startCicle);
        ASMCompiler.mv.visitLabel(endCicle);
    }
}
