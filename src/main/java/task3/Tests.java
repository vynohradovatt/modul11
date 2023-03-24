package task3;

import java.util.List;

public class Tests {

    public static void main(String[] args) {

        String[] arrayNumbers = {"1, 2, 0", "4, 5", "98, 78"};

        StringOfNumbers string = new StringOfNumbers();
        String numbers = string.getAllNumbersFromArray(arrayNumbers);

        System.out.println(numbers);
    }
}
