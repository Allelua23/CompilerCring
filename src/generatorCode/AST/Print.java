package generatorCode.AST;

import generatorCode.compiler.ASMCompiler;
import org.objectweb.asm.Opcodes;
import symbols.Type;

public class Print extends Stmt implements Opcodes {
    Expr expr;
    public Print(Expr x) { expr = x;
//        if ( expr1.type == null || expr2.type == null ) error("type error");
    }
    public void genJVM() {
        //ASMCompiler.mv.visitFieldInsn(GETFIELD, "java/lang/System", "out", "Ljava/io/PrintStream;");
        ASMCompiler.mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        expr.genJVM();
        String input_string = "";
        switch (input_string) {

        }
        if (Type.Int.equals(expr.type)) input_string = "(I)V";
        else if (Type.Float.equals(expr.type)) input_string = "(F)V";
        else if (Type.Char.equals(expr.type)) input_string = "(C)V";
        else if (Type.Bool.equals(expr.type)) input_string = "(Z)V";
        ASMCompiler.mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "print", input_string, false);
        // на "(Ljava/lang/String;)V" нехорошо реагирует
    }
}
