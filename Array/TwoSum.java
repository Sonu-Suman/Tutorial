package Array;

/*
Two sum problem (find pair with given sum in array.)

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice
ex-
Input:
-----------
arr = {2, 7, 11, 15}
target = 18

Output:
------------
(1, 2)

Explanation :
-----------------
arr[1] + arr[2] = 7+11 = 18

 */


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSum {
    // This is the first Brute-Force method.
    public static int[] twoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("Values not found");
    }

    // This is th optimized methode for finding solutions.
    public static int[] twoSum1(int[] arr, int target){
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            numMap.put(arr[i], i);
        }
        for(int i=0; i<arr.length; i++){
            int numToFind = target-arr[i];

            if(numMap.containsKey(numToFind) && numMap.get(numToFind)!=i){
                return new int[] {i, numMap.get(numToFind)};
            }
        }
        throw new ArithmeticException("Pairs not found.");
    }

    public static void main(String[] args) {
        int[] arr = {-1, 7, 1, 3, 4, 18};
        int target = 5;
        System.out.println(Arrays.toString(twoSum(arr, target)));
        System.out.println(Arrays.toString(twoSum1(arr, target)));
    }
}
