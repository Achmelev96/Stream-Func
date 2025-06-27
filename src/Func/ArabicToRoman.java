package Func;

import java.util.function.Function;

public class ArabicToRoman implements Function<Integer, String> {
    @Override
    public String apply(Integer n) {
        if (n == null || n <= 0 || n >= 4000)
            throw new IllegalArgumentException("Ожидается число в диапазоне от 1 до 3999");
        return toRoman(n);
    }

    private static String toRoman(int number) {
        int[]    values = {1000, 900, 500, 400, 100,  90,  50,  40,  10,   9,   5,   4,   1};
        String[] romNum = {"M",  "CM","D", "CD","C", "XC","L", "XL","X", "IX","V", "IV","I"};
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (number > 0) {
            while (number >= values[i]) {
                sb.append(romNum[i]);
                number -= values[i];
            }
            i++;
        }
        return sb.toString();
    }
}
