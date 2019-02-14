package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int[] numbers2 = new int[] {2,3,4,7,8,123,4125,616321,213,10,2,3,4,7,8,123,4125,616321,125,23,756,846,34,42,867,
                2356,123578,987,7612};
        //When
        double result = ArrayOperations.getAverage(numbers);
        double result2 = ArrayOperations.getAverage(numbers2);
        //Then
        Assert.assertEquals(15.5, result, 0.1);
        Assert.assertEquals(41858.6, result2, 0.1);
    }
}
