// find first and last position of target value
// eg- arr= [2,3,4,6,6,6,6,6,8] target = 6 op= [3,7]
package BinarySearch;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Questionn5 {
    static int firstSearch(int[] list, int target) {
        int start = 0;
        int end = list.length - 1;
        int firstPosition = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (list[mid] == target) {
                firstPosition = mid;
                end = mid - 1;
            } else if (list[mid] > target) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return firstPosition;
    }

    static int lastSearch(int[] list, int target) {
        int start = 0;
        int end = list.length - 1;
        int lastPosition = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (list[mid] == target) {
                lastPosition = mid;
                start = mid + 1;
            } else if (list[mid] > target) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return lastPosition;
    }

    //main method logic
    public static int[] searchRange(int[] list, int target) {

        int result1 = firstSearch(list, target);
        int result2 = lastSearch(list, target);

        return new int[]{result1, result2};
    }

    public static void main(String[] args){
        int[] list= {2,3,4,6,6,6,6,6,8};
        int target= 6;

//        int result1= firstSearch(list, target);
//        int result2= lastSearch(list, target);

        //System.out.println(result1+" "+result2);
        int[] ans = searchRange(list,target);
        System.out.println(Arrays.toString(ans));
    }
}
