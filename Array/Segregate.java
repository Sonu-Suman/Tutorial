package Array;

/*
Question:
-------------------------------------------------
Segregate an array of 0's and 1's in Order, write a code to segregate 0's on left side and 1's in right side.

Input:
----------------
arr = [0, 1, 0, 1, 0, 0, 1]

Output:
---------------
arr = [0, 0, 0, 0, 1, 1, 1]

--> Traverse an array, we first move 0's on left side then we move 1's in right side in a single traversal.

-> Time Complexity:
------------------------
Time Complexity os this approach is O(n).

 */

import java.util.Arrays;



public class Segregate {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 0, 1};
        int j = 0;

        for(int i=0; i<arr.length; i++){
            arr[j++] = arr[i];
        }

        while(j<arr.length){
            arr[j++] = 1;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

//public class Segregate {
//    public static void main(String[] args) {
//        int[] arr = {0, 1, 0, 1, 1, 0, 0, 1};
//        int j = 0;
//
//        for(int i=0; i< arr.length-2; i++){
//            if (arr[j]>arr[j+1]){
//                int t = arr[j+1];
//                arr[j+1] = arr[j];
//                arr[j] = t;
//                System.out.println(Arrays.toString(arr));
//            }else if (arr[j]==arr[j+1]){
//                int t = arr[j+2];
//                arr[j+2] = arr[j];
//                arr[j+1] = arr[j+1];
//                arr[j] = t;
//            }
//            j++;
//        }
//        System.out.println("Segregated array: " + Arrays.toString(arr));
//    }
//}
