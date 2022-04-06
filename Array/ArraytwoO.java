package Array;

/*
Find pairs with given sum in sorted Array.

Given an array A of size N.
we need to find all pairs in the array that sum to a number equal to k.

If no such pair exists then output will be -1;

Array elements are distinct and in sorted order.

Input:
arr = {1,2, 3, 4, 5, 6, 7}
Sum =9

Output:
pair= {(2, 7), (3, 6), (4, 5)};

 */

public class ArraytwoO {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int Sum=9;

        int low = 0;
        int high = arr.length-1;

        while (low < high) {
            if ((arr[low]+arr[(high)])==Sum) {
                low++;
                high--;
                System.out.println("Pair : ("+arr[low]+ " "+arr[high]+")");
            } else if((arr[low]+arr[high])<Sum) {
                low++;
            } else if((arr[low]+arr[high])>Sum) {
                high--;
            }
        }
        System.out.println(-1);
    }
}
