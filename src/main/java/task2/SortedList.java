package task2;

import java.util.Comparator;
import java.util.List;

public class SortedList {

    public List<String> getSorted(List<String> stringList){

        List<String> sortedList = stringList
                .stream()
                .map(p -> p.toUpperCase())
                .sorted((s1, s2) -> s2.compareTo(s1))
                .toList();

        return sortedList;
    }
}
