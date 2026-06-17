// find the number greater than equal to target
package BinarySearch;

public class Question1 {

    //method
    static int binarySearch( int[] arr, int target){
        int start= 0;
        int end= arr.length - 1;
        if(target>arr[arr.length-1]) return -1;

        while(start<=end){
            int mid= start+ (end-start)/2;
            //condition apply

            if(arr[mid] == target){
                return mid;

            }

            if(arr[mid]>target){
                end= mid -1;
            }
            else {
                start= mid+1;
            }
        }
        //return arr[start];
        return start;
    }

    public static void main(String[] args){
        int[] arr= {1,3,5,7,9,12,15}; //crate array
        int target= 11;

        //method call

        int ans1= binarySearch(arr, target);
        System.out.println("The position of taregt value is: "+ans1);

    }
}
