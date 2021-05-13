package generatorCode.AST;

import generatorCode.compiler.ASMCompiler;
import org.objectweb.asm.Opcodes;
import symbols.Type;

public class Print extends Stmt {
    Expr expr;
    public Print(Expr x) { expr = x;
//        if ( expr1.type == null || expr2.type == null ) error("type error");
    }
    public void genJVM() {
        ASMCompiler.mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        expr.genJVM();
        String t = "";
        if (Type.Int.equals(expr.type)) t = "(I)V";
        else if (Type.Float.equals(expr.type)) t = "(R)V";
        else if (Type.Char.equals(expr.type)) t = "(C)V";
        else if (Type.Bool.equals(expr.type)) t = "(Z)V";
        ASMCompiler.mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "print", t, false);
    }
}
