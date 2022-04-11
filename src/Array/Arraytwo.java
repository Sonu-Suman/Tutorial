package Array;

import java.util.ArrayList;
import java.util.List;

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

public class Arraytwo {
    static List<List> SubListSum(int[] arr, int n) {
        List<List> l = new ArrayList<>();

        int m=0;
        for(int i=0; i < arr.length; i++){
            for(int j=(i+1); j < arr.length; j++){
                if((arr[i]+arr[j])==n){
                    List<Integer> k = new ArrayList<>();
                    k.add(arr[i]);
                    k.add(arr[j]);
                    l.add(k);
                    m++;
                    break;
                }
            }
        }
        if(m<1){
            System.out.println(-1);
        }
        return l;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int Sum=9;
        System.out.println(SubListSum(arr, Sum));

    }
}
