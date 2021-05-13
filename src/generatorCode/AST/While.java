package generatorCode.AST;

import generatorCode.compiler.ASMCompiler;
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import symbols.Type;

public class While extends Stmt {
    Expr expr; Stmt stmt;
    public While() { expr = null; stmt = null;}
    public void init(Expr x, Stmt s) {
        expr = x; stmt = s;
        if (expr.type != Type.Bool)
            expr.error("boolean required in while");
    }

    //public While(Expr x, Stmt s) { expr = null; stmt = null; }
    public void genJVM(int a) {
        Label startCicle = new Label();
        Label endCicle = new Label();
        Label statments = new Label();
        ASMCompiler.mv.visitLabel(startCicle);
        after = a;
        expr.jumping(0, a);
        ASMCompiler.mv.visitJumpInsn(Opcodes.IFNE, statments);
        ASMCompiler.mv.visitJumpInsn(Opcodes.GOTO, endCicle);
        ASMCompiler.mv.visitLabel(statments);
        stmt.genJVM();
        ASMCompiler.mv.visitJumpInsn(Opcodes.GOTO, startCicle);
        ASMCompiler.mv.visitLabel(endCicle);
    }
}
