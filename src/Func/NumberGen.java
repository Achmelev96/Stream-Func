package Func;

import java.util.Random;
import java.util.function.Supplier;

public class NumberGen implements Supplier<Integer> {
    @Override
    public Integer get() {
        Random random = new Random();
        return random.nextInt(1,4000);
    }
}
