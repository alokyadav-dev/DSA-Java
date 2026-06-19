// return 1st position of target value
package BinarySearch;

public class Question4 {
    static int bSearchLast(int[] nums, int target){
        int start= 0;
        int end= nums.length-1;
        int ans= -1;
        while(start<= end){
            int mid= start+ (end- start)/2;


            if(nums[mid]==target){
                ans= mid;
                end=mid-1; // left move
            }

            else if(nums[mid]>target){
                end= mid-1;
            }

            else{
                start= mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums= {1,2,3,3,3,3,3,3,5,5,5,6,8};
        int target= 3;


        int result= bSearchLast(nums, target);
        System.out.println(result);
    }
}
