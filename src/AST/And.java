package generatorCode.AST;

import generatorCode.compiler.ASMCompiler;
import org.objectweb.asm.Opcodes;

// ??????? ?????? Or
public class And extends Logical {
    public And(String s, Expr x1, Expr x2) { super(s, x1, x2); }
    public void genJVM() {
        expr1.genJVM();
        expr2.genJVM();
        ASMCompiler.mv.visitInsn(Opcodes.IMUL);
    }
}
