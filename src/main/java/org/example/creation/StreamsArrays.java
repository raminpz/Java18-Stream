package org.example.creation;

import java.util.Arrays;

public class StreamsArrays {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9};

        long numElements =  Arrays.stream(numbers).count();
        System.out.println("numElements = " + numElements);
        
        long sumTotal =  Arrays.stream(numbers).sum();
        System.out.println("sumTotal = " + sumTotal);
    }
}
