package task3;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringOfNumbers {

    public String getAllNumbersFromArray(String[] array) {

        List<Integer> numbers = Arrays.stream(array)
                .flatMapToInt(s -> {
                    return Arrays.stream(s.split(",\\s*")).mapToInt(s1 -> Integer.parseInt(s1));
                })
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        String stringOfNumbers = numbers
                .stream()
                .map(integer -> integer.toString())
                .collect(Collectors.joining(", "));

        return stringOfNumbers;
    }
}
