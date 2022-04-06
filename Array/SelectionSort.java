package Array;

import java.util.Arrays;

public class SelectionSort {
    // This is the first method of selection sort.

    public static void selectionsort1(int[] arr){
        int len = arr.length;

        for(int j=0; j<len; j++){
            for(int i=0; i<len-(j+1); i++){
                if(arr[i]>arr[i+1]){
                    int t = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // This is the second method for selection sort

    public static void selectionsort2(int[] arr) {
        int temp;
        int j;

        for(int i=0; i<arr.length; i++){
            temp = arr[i];
            j = i-1;

            while(j>=0 && temp<arr[i]){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 3, 0, 2, 9, 1};
        selectionsort1(arr);
        selectionsort2(arr);
        for (int k=0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
