package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class OddNumber {


    public String getOddIndex(List<String> list) {

        List<String> collect = IntStream.range(0, list.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(index -> list.get(index))
                .collect(Collectors.toList());

        int count = 1;
        StringBuilder str = new StringBuilder();
        for (String s : collect) {
            str.append(count).append(". ").append(s).append(System.lineSeparator());
            count += 2;
        }
        return str.toString();
    }
}
