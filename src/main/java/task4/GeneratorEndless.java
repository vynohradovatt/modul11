package task4;

import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class GeneratorEndless {

    public static void main(String[] args) {

        long a = 25214903917l;
        int c = 11;
        double m = Math.pow(2, 48);

        GeneratorEndless generatorEndless = new GeneratorEndless();

        Stream<Long> longStream = generatorEndless.getGenerate(a, c, m);

        longStream
                .limit(10)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public Stream<Long> getGenerate (long a, int c, double m){

        Stream<Long> longStream = Stream
                .iterate(0.0, seed -> (a * seed + c) % m)
                .map(Double::longValue);
        return longStream;


    }
}
