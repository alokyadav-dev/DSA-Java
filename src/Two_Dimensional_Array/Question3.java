package Two_Dimensional_Array;

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        int[][] matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target= 16;

        int[] ans= (binarySearch(matrix,target));
        System.out.println((Arrays.toString(ans)));
    }

    static int[] binarySearch(int[][] matrix, int target) {
        int row= matrix.length;
        int col= matrix[0].length;

        //to find 1st and last index like in 1D array
        int low= 0;
        int high= row*col-1;

        while(low<= high) {
            int mid= low+(high-low)/2;

            // now convert 1D array into 2d row and column

            int Mrow = mid/col;
            int Mcol= mid % col;

            if(matrix[Mrow][Mcol]== target) {
                return new int[] {Mrow, Mcol};
            }
            else if (matrix[Mrow][Mcol]>target){
                high= mid-1;
            }
            else {
                low= mid+1;
            }
        }

        return new int[] {-1,-1};
    }
}
