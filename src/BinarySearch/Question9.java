package BinarySearch;

//Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
//Return the minimized largest sum of the split.
public class Question9 {
    static int splitArray(int[] nums, int k) {
        int low= 0;
        int high=0;
        for(int num: nums) {
            low= Math.max(low,num);
            high+=num;

        }
        while(low<high){
            int mid= low+(high-low)/2;

            int pieces= 1;
            int sum= 0;
            //check if mid is possible
            for(int num :nums) {
                if(sum+num>mid) {
                    pieces++;
                    sum= num;
                }
                else {
                    sum+= num;
                }
            }

            if (pieces>k) {
                low= mid+1;
            }
            else {
                high= mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums= {7,2,5,10,8};
        int k= 2;
        int result= splitArray(nums, k);
        System.out.println(result);
    }

}
