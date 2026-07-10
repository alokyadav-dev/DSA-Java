package Sorting_Algorithm;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        int[] arr = {7, 4, 9,6, 5,6,5,6,5,6, 1};
        bubbleSort(arr); // method call

            System.out.println(Arrays.toString(arr));
    }
    // method for sorting
    static void bubbleSort(int[] arr) {
        for (int i= 0; i< arr.length-1; i++) {
            for(int j= 0; j< arr.length-1-i; j++) {
                if(arr[j]> arr[j+1]) {
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
}
