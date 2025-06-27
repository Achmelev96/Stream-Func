package Func;

import java.util.Random;
public class Main {
    public static void main(String[] args) {

        for (int index = 0; index < 5; index++) {
            int num = new Random().nextInt(256);
            Integer.toBinaryString(num);

        }

    }
}
