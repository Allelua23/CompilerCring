package generatorCode.AST;

import generatorCode.compiler.ASMCompiler;
import org.objectweb.asm.Opcodes;
import symbols.Type;

// арифметические операции
public class Arithm extends Op {
    public Expr expr1, expr2;
    public Arithm(String s, Expr x1, Expr x2) {
        super(s, null); expr1 = x1; expr2 = x2;
        type = Type.max(expr1.type, expr2.type);
        if (type == null) error("type error");
    }
    public void genJVM() {
        expr1.genJVM();
        expr2.genJVM();
        switch (op) {
            case "+":
                if (Type.Float.equals(type)) ASMCompiler.mv.visitInsn(Opcodes.FADD);
                else ASMCompiler.mv.visitInsn(Opcodes.IADD);
                break;
            case "-":
                if (Type.Float.equals(type)) ASMCompiler.mv.visitInsn(Opcodes.FSUB);
                else ASMCompiler.mv.visitInsn(Opcodes.ISUB);
                break;
            case "*":
                if (Type.Float.equals(type)) ASMCompiler.mv.visitInsn(Opcodes.FMUL);
                else ASMCompiler.mv.visitInsn(Opcodes.IMUL);
                break;
            case "/":
                if (Type.Float.equals(type)) ASMCompiler.mv.visitInsn(Opcodes.FDIV);
                else ASMCompiler.mv.visitInsn(Opcodes.IDIV);
                break;
        }
    }
}
