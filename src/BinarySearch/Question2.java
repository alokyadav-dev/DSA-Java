//return smallest grater charecter than target eg- [a,d,h] target d then op is --h
package BinarySearch;

public class Question2 {
    static char nextGraterLetter(char[] letter, char target) {
        int start= 0;
        int end= letter.length -1;

        while (start <= end) {
            int mid = start+(end - start)/2;

            if(letter[mid]>target){
                end= mid-1;
            }

            else {
                start= mid+1;
            }
        }
        return letter[start% letter.length];
    }

    public static void main(String[] args) {
        char[] letter= {'a', 'd', 'g', 'j'};
        char target= 'j';

        //method call

        char ans= nextGraterLetter(letter, target);
        System.out.println(ans);
    }
}
