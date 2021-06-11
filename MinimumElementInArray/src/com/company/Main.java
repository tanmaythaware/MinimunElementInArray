package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array: ");
        int n = scan.nextInt();
        int[] array = new int[n];
        array = enterIntegers(array);
        printArray(array);
        System.out.println("Minimum Element in the array is " + minElement(array));

    }
    public static int[] enterIntegers(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter Element " + (i+1) + ": ");
            array[i] = scan.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array){
        System.out.println("Array: " + Arrays.toString(array));
    }
    public static int minElement(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
