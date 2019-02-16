package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        if(numbers == null) return 0.0;

        Arrays.stream(numbers)
               .forEach(System.out::println);

        double result = IntStream.range(0, numbers.length)
                .mapToDouble(n -> numbers[n])
                .average().orElse(0.0);

        return result;
    }
}
