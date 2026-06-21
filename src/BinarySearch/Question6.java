//find position of an element in a sorted array of infinite size
package BinarySearch;

public class Question6 {
    public static void main(String[] args) {
        int[] arr= {2,4,8,13,17,19,23,27,34,56};
        int target= 17;
        int start;
        int end;

        // call method
        int result= chunkSearch(arr, target);
        System.out.println(result);

    }

    // method for search chunk by chunk
    static int chunkSearch(int[] arr, int target){
        int start= 0;
        int end= 1;
        while(target>arr[end]){
            int temp = end + 1;
            end= end+(end-start+1)*2;
            start= temp;
        }
        return bSearch(arr, target, start,end);
    }

    //method for binary search
    static int bSearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid= start+ (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if (arr[mid]<target) {
                start= mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return -1;
    }
}
