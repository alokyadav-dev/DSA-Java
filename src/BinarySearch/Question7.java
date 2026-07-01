// search peak value index in mountain Array also known as biotonic array
package BinarySearch;

public class Question7 {
    public static void main(String[] args){
        int[] Mountainarray= {1,3,19,65,11,8,4};
        int result= peakSearch(Mountainarray);
        System.out.println(result);
    }

    //method created
    static int peakSearch(int[] Mountainarray){
        int start= 0;
        int end= Mountainarray.length-1;

        while(start< end) {
            int mid= start+(end-start)/2;

            if(Mountainarray[mid]< Mountainarray[mid+1]) {
                start= mid+1;
            }
            else {
                end= mid;
            }
        }
        return end;
    }
}
