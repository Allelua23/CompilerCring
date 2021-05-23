import Lexer_Parser.cringLexer;
import Lexer_Parser.cringParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            org.antlr.v4.runtime.CharStream input =
                    CharStreams.fromFileName("E://IntelliJ IDEA Community Edition 2019.2.4/Kurs/src/test/zazhita.cring");
            System.out.println("Начинаем работу...");

            System.out.println("Первый этап - лексер");
            cringLexer lexer = new cringLexer(input);

            System.out.println("---------------------------------------------");

            System.out.println("Второй этап - парсер");
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            cringParser parser = new cringParser(tokens);
            //parser.addParseListener(new MyListener());
            //parser.program();
            //cringParser.ProgramContext tree = parser.program();
            ParseTree tree = parser.program(); // see the grammar ->
                                               // starting point for
                                               // parsing a java file
            System.out.println("------------------------------------------------");

            System.out.println("Третий этап - генерация кода");
            MajorCringVisitor visitor = new MajorCringVisitor(); // extends JavaBaseVisitor<Void>
                                                                 // and overrides the methods
                                                                 // you're interested
            visitor.visit(tree);
            System.out.println("Готово!!!");
        }
        catch (FileNotFoundException e) { e.printStackTrace(); }
        catch (IOException e) { e.printStackTrace(); }
    }

    //добавить break и continue
}
