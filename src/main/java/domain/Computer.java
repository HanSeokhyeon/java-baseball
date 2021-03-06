package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Computer {
    private static final int START = 1;
    private static final int END = 9;
    private static final int LENGTH_OF_NUMBERS = 3;
    private List<BaseballNumber> numbers;

    public Computer(Boolean shuffled) {
        generateNumbers(shuffled);
    }

    private void generateNumbers(Boolean shuffled) {
        numbers = new ArrayList<>();
        for (int i=START; i<=END; i++) {
            numbers.add(new BaseballNumber(i));
        }
        if (shuffled) {
            Collections.shuffle(numbers);
        }
        numbers = numbers.subList(0, LENGTH_OF_NUMBERS);
    }

    public List<BaseballNumber> getNumbers() {
        return numbers;
    }
}
