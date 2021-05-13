package generatorCode.compiler;

import generatorCode.AST.Stmt;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ASMCompiler implements Opcodes {
    Stmt main;
    Stmt consts;
    Stmt functions;
    public static MethodVisitor mv;
    private static ClassWriter cw;

    public ASMCompiler() {}
    public ASMCompiler(Stmt s) { main = s; }
    public ASMCompiler(Stmt main, Stmt consts) { this.main = main;
                                                 this.consts = consts;}
    public void genClass(File file) {
        String className = file.getName();
        if (className.contains("."))
            className = className.substring(0, className.lastIndexOf('.'));
        cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        //FieldVisitor fv;
        cw.visit(V1_8, ACC_PUBLIC, className, null, "java/lang/Object", null);
        //сгенерировать константы
        if (consts != null) genConst();

        mv = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
        mv.visitCode();
        mv.visitVarInsn(ALOAD, 0);
        mv.visitMaxs(1, 1);
        mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        mv.visitInsn(RETURN);
        mv.visitEnd();
        // сгенерировать функцию (Function)
        genFunction();
        // сгенерировать Main
        genMain();

        cw.visitEnd();
        this.WriteClass(cw, file);
    }

    public void genConst() {
        if (consts != null) genConst();
       /*for (ConstValue cv : consts) {
           cw.visitField(ACC_PUBLIC + ACC_STATIC + ACC_FINAL, cv.varName, cv.getType(), null, cv.getValue());
       }*/
    }
    public void genMain() {
        mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);
        if (main != null) main.genJVM();
        else System.out.println("Statement main is clear");
        mv.visitMaxs(1, 1);
        mv.visitInsn(RETURN);
        mv.visitEnd();
    }
    public void WriteClass(ClassWriter cw, File file) {
        FileOutputStream fos;
        //FileWriter test;
        try {
            fos = new FileOutputStream(file);
            fos.write(cw.toByteArray());
            fos.close();
        }
        catch (IOException ex) {
            System.out.println("Writing class Error!");
        }
    }
    public void genFunction() {
        mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "", "([Ljava/lang/String;)V", null, null);
        if (functions != null) functions.genJVM();
        else System.out.println("Statement function is clear");
        mv.visitMaxs(1, 1);
        mv.visitInsn(RETURN);
        mv.visitEnd();
    }
}
