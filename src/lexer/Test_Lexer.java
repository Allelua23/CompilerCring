package lexer;

public class Test_Lexer {
    public static void main(String[] args) {
        Lexer lexer = new Lexer("E:\\IntelliJ IDEA Community Edition 2019.2.4\\Kurs\\src\\Test.txt");

        System.out.println("Лексический анализ");
        System.out.println("---------------------");
        while (!lexer.isExausthed()) {
            System.out.printf("%-18s :  %s \n",lexer.currentLexema() , lexer.currentToken());
            lexer.moveAhead();
        }

        if (lexer.isSuccessful()) {
            System.out.println("Оки-доки! :)");
        } else {
            System.out.println(lexer.errorMessage());
        }
    }
}
