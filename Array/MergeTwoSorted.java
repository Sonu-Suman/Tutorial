package Array;

/*
Given two sorted arrays, write a code to merge then in a sorted manner.

ex:
----
Input:
------------------
arr1 = {1, 5, 6, 7}
arr2 = {2, 5, 8, 9, 11}

Output:
------------------
arr = {1, 2, 5, 5, 6, 7, 8, 9, 11}

To solve this question in given Time complexity and Space complexity.
--> Time Complexity = O(n1+n2)
--> Space Complexity = O(n1+n2)
    Where:
    n1 :- number of elements present in arr1.
    n2 :- number of elements present in arr2.
 */


import java.util.*;
import LinkedList.SingleLL.*;

public class MergeTwoSorted {
    public static int[] Merge(int[] arr1, int[] arr2){
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] l = new int[len1+len2];
        int k =0;
        int i = 0;
        int j = 0;

        while(i<len1 && j<len2){
            if(arr1[i]<arr2[j]){
                l[k++] = arr1[i++];
            } else{
                l[k++] = arr2[j++];
            }
        }

        while (i<len1){
            l[k++] = arr1[i++];
        }

        while(j<len2){
            l[k++] = arr2[j++];
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 6, 7};
        int[] arr2 = {2, 5, 8, 9, 11};
        System.out.println(Arrays.toString(Merge(arr1, arr2)));
    }
}

