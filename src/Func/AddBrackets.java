package Func;

import java.util.function.UnaryOperator;

public class AddBrackets implements UnaryOperator <String> {
    @Override
    public String apply(String s) {
        return "[" + s + "]";
    }
}
