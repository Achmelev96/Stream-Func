package Func;

import java.util.Random;
public class NumToRoman {
    public static void main(String[] args) {
        // реализация без функциональных интерфейсов
        Random random = new Random();
        for (int index = 0; index < 4; index++) {
            int[]    values = {1000, 900, 500, 400, 100,  90,  50,  40,  10,   9,   5,   4,   1};
            String[] romNum = {"M",  "CM","D", "CD","C", "XC","L", "XL","X", "IX","V", "IV","I"};

            int arabicNumber = random.nextInt(3999) + 1;
            int originalNum = arabicNumber;

            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (arabicNumber > 0) {
                while (arabicNumber >= values[i]) {
                    sb.append(romNum[i]);
                    arabicNumber -= values[i];
                }
                i++;
            }

            String toRoman = sb.toString();
            toRoman = "[" + toRoman + "]";
            System.out.println(originalNum + " -> " + toRoman);
        }

        NumberGen generator = new NumberGen();
        ArabicToRoman converter = new ArabicToRoman();
        AddBrackets addBrackets = new AddBrackets();

        System.out.println("\nРеализация с функциональными интерфейсами");
        for (int index = 0; index < 4; index++) {
            int arabic = generator.get();
            String roman = converter.apply(arabic);
            String mitBrackets = addBrackets.apply(roman);
            System.out.println(arabic + " -> " + mitBrackets);
        }
    }
}
