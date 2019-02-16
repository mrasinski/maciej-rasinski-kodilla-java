package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int[] numbers2 = new int[] {80,45,4,64,40,1,5,14,14,63,54,13,35,100,30,98,100,4,43,21,52,84,71,64,63,51,93,56,89,23};
        int[] numbers3 = null;
        //When
        double result = ArrayOperations.getAverage(numbers);
        double result2 = ArrayOperations.getAverage(numbers2);
        double result3 = ArrayOperations.getAverage(numbers3);
        //Then
        Assert.assertEquals(15.5, result, 0.1);
        Assert.assertEquals(49.1, result2, 0.1);
        Assert.assertEquals(0.0, result3, 0.1);
    }
}
