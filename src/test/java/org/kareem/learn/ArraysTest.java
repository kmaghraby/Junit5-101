package org.kareem.learn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.kareem.learn.SortArray;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {

    SortArray arr = new SortArray();

    @Test
    void testArrays() {

        int[] expected = {0,2,4,6};
        int[] actual = {2,4,0,6};
        assertArrayEquals(expected, arr.sortArray(actual));

    }

    //Test case should fail when there are no exception and pass when there is generated exception
    @Test
    void testArrays_Exception() {
//        try {
//            int[] unsortedArray = {1,6,3};
//            int[] sortedArray = arr.sortArray(unsortedArray);
//
//            for (int ele:sortedArray){
//                System.out.println(ele);
//            }
//            System.out.println("Below Exception!");
//            fail();
//        }
//
//        catch (NullPointerException e)
//
//        {
//            System.out.println("Exception!!");
//        }

        int[] unsortedArray= null;
        assertThrows(NullPointerException.class, ()->arr.sortArray(unsortedArray));
    }

    @Test
    void testArrays_performance(){

        int[] unsortedArray = {2,5,1};
        Assertions.assertTimeout(Duration.ofMillis(10),()-> arr.sortArray(unsortedArray));
    }
}
