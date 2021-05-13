package lexer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Token {
    TK_ASSIGN ("="),
    TK_MUL ("\\*"), TK_DIV ("/"), TK_PLUS ("\\+"),
    TK_MINUS ("-"), TK_GT (">"), TK_LESS ("<"), TK_EQUAL ("=="),
    TK_GRE (">="), TK_LE ("<="), DIFFERENT ("<>"),
    TK_AND ("&"),  TK_OR ("\\|"), TK_NE ("~"),
    TK_KEY_IF ("if"), TK_KEY_ELSE ("else"),
    TK_KEY_WHILE ("while"), TK_KEY_BREAK ("break"), TK_KEY_DO ("do"),
    TK_KEY_FOR ("for"), TK_KEY_CONT ("continue"), TK_KEY_GOTO ("goto"),
    TK_KEY_CHAR ("char"), TK_KEY_INT ("int"), TK_KEY_FLOAT ("float"),
    TK_KEY_VOID ("void"), TK_KEY_RE ("return"), TK_KEY_CONST ("const"),
    TK_SEMI (";"), TK_COMMA (","),
    TK_OPEN_BRACKET ("\\{"), TK_CLOSE_BRACKET ("\\}"),
    OPEN_PARENTHESIS ("\\("), CLOSE_PARENTHESIS ("\\)"),
    STRING ("\"[^\"]+\""), IDENTIFIER ("\\w+"), INTEGER ("\\d+"), REAL ("(\\d+)\\.\\d+?"),
    TK_COMM ("#");

    private final Pattern pattern;

    Token(String regex) {
        pattern = Pattern.compile("^" + regex);
    }

    int endOfMatch(String s) {
        Matcher m = pattern.matcher(s);

        if (m.find()) {
            return m.end();
        }
        return -1;
    }
}
