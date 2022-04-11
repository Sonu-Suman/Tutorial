package Array;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void Method1(int[] arr){
        Arrays.sort(arr);

        int len = arr.length;
        int j=0;

        for (int i=0; i<len-1; i++){
            if (arr[i]!=arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[len-1];
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 6, 4, 4, 5, 4, 2};
        Method1(arr);
    }
}
