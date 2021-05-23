package generatorCode.compiler;

import generatorCode.AST.Stmt;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ASMCompiler implements Opcodes {
    private Stmt main;
    private Stmt functions;
    public static MethodVisitor mv;
    private static ClassWriter cw;

    public ASMCompiler() {}
    public ASMCompiler(Stmt s) { main = s; }
    public void genClass(File file) {
        String className = file.getName();
        if (className.contains("."))
            className = className.substring(0, className.lastIndexOf('.'));
        // класс, который позволяет получить байткод
        // параметр COMPUTE_FRAMES включает автоматический рассчет
        // кол-во используемых локальных переменных и максимальный размер стэка (эта информация нужна для JVM)
        // а так же рассчитывает переходы по меткам
        cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        //FieldVisitor fv;
        /* здесь V1_8 - версия библиотеки ASM, ACC_PUBLIC - класс публичный, className - имя класса,
           "java/lang/Runnable" - superName, имя родительского класса
        * */
        cw.visit(V1_8, ACC_PUBLIC, className, null, "java/lang/Object", null); // можно добавить в конце вместо null "java/lang/Runnable"
        // создаем метод public void <init>()
        mv = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
        mv.visitCode();
        // вызываем родительский констуктор
        // вполне видна взаимосвязь с байткодом JVM
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
        try {
            fos = new FileOutputStream(file);
            fos.write(cw.toByteArray()); // получаем байткод
            fos.close();
        }
        catch (IOException ex) {
            System.out.println("Writing class Error!");
        }
    }

    public void genFunction() {
        /*for (Function fn : functions) {

        }
        mv = cw.visitMethod(ACC_PUBLIC, "function", "([Ljava/lang/String;I)V", null, null);
        if (functions != null) functions.genJVM();
        else System.out.println("Statement function is clear");
        mv.visitMaxs(2, 2);
        mv.visitInsn(RETURN);
        mv.visitEnd();*/
    }
}
