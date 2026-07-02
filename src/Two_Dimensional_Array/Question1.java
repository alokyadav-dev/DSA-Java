//Two Dimensional Array
//Question:- find index of target value in unorderd Array
package Two_Dimesnsional_Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Question1 {
    public static void main(String[] args ) {
        int[][] arr= {{12,14,19},{30,40,20},{17,81,90}};
        int target= 81;

        int[] result= linearSearch(arr, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] linearSearch(int[][] arr , int target) {
        for(int row=0; row<arr.length; row++) {
            for(int col= 0; col<arr[row].length;col++) {
                if(arr[row][col]==target) {
                    return new int[] {row,col};
                }
            }
        }return new int[] {-1,-1};

    }
}
