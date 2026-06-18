//find the last position of target value and if value not find return -1
package BinarySearch;

public class Question3 {

    static int bSearchLast(int[] nums, int target){
        int start= 0;
        int end= nums.length-1;
        int ans= -1;
        while(start<= end){
            int mid= start+ (end- start)/2;


            if(nums[mid]==target){
                ans= mid;
                start=mid+1; // right move
            }
            if(nums[mid]>target){
                end= mid-1;
            }

            else{
                start= mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums= {1,3,5,5,5,5,6,6,8};
        int target= 6;


        int result= bSearchLast(nums, target);
        System.out.println(result);
    }
}
