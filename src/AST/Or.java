package generatorCode.AST;

import generatorCode.compiler.ASMCompiler;
import org.objectweb.asm.Opcodes;

public class Or extends Logical {
    public Or(String s, Expr x1, Expr x2) { super(s, x1, x2); }
    public void genJVM() {
        System.out.println("OR!");
        expr1.genJVM();
        expr2.genJVM();
        System.out.println("IADD");
        ASMCompiler.mv.visitInsn(Opcodes.IADD);
    }
}
