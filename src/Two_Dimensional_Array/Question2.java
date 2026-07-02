package Two_Dimensional_Array;
import java.util.Arrays;

public class Question2 {
    public static void main(String[] args){
        int[][] arr= {{2,8,9,10},{3,12,15,17},{9,15,19,21},{40,50,60,70}};
        int target= 19;

        int[] ans= binarySearch(arr, target);  //method call store value in ans array
        //System.out.println(ans);  // it only print array address

        System.out.println(Arrays.toString(ans));
    }

    static int[] binarySearch(int[][] arr, int target) {
        int row= 0;
        int col= arr[0].length-1;  //we also write it arr[row].length-1; both same because it is Square matrix
        while(row <arr.length && col>= 0) {
            if(arr[row][col]== target) {
                return new int[] {row, col};
            } else if (arr[row][col]<target) {
                row++;
            }
            else {
                col--;
            }
        }
        return new int[] {-1, -1};
    }
}
