package task5;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FixStream {

    public static void main(String[] args) {

        Stream<String> s1 = Arrays.stream(new String[]{"A", "B", "C"});
        Stream<String> s2 = Arrays.stream(new String[]{"D", "E", "F", "L", "N"});

        FixStream f = new FixStream();

        Stream<String> zip = f.zip(s1, s2);

        for (String s: zip.toList()) {
            System.out.println(s);
        }
    }


    public  <T> Stream<T> zip(Stream<T> first, Stream<T> second){


        List<T> firstStream = first.toList();
        List<T> secondStream = second.toList();
        List<T> resultStream = new ArrayList<>();
        int lenth = secondStream.size() - firstStream.size();
        if (!firstStream.isEmpty() && !secondStream.isEmpty())
            for(int i = 0; i < lenth ; i++) {
                resultStream.add(firstStream.get(i));
                resultStream.add(secondStream.get(i));
            }
        Stream<T> stream = resultStream.stream();

        return stream;
    }
}
