package com.kodilla.testing.collection;

import org.junit.*;
import java.util.*;

public class CollectionTestSuite {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 1; i < 10; i++) {
            if(i % 2 != 0) {
                list1.add(i);
            }
        }
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        list1 = oddNumbersExterminator.exterminate(list1);
        System.out.println("Testing empty list");
        //Then
        Assert.assertEquals(list1, list2);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list1.add(i);
            list2.add(i);
        }
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        list2 = oddNumbersExterminator.exterminate(list1);
        System.out.println("Testing normal list");
        //Then
        Assert.assertEquals(false, list2.equals(list1));
    }
}
