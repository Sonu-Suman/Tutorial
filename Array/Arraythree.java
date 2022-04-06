package Array;

/*
Question:
---------------------
find the common element in sorted element?

Input:
-----------
 arr1 = {1, 5, 10, 20, 40 ,80}
 arr2 = {6, 7, 20, 80, 100}
 arr3 = {3, 4, 15, 20, 30, 70, 80, 120}

 Output:
 --------------
 [20, 80]
 */


public class Arraythree {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40 ,80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};

        int x=0, y=0, z=0;

        while(x<arr1.length && y<arr2.length && z<arr3.length) {
            if (arr1[x]==arr2[y] && arr1[x]==arr3[z]){
                System.out.println("This is the common Element: " + arr1[x]);
                x++;
                y++;
                z++;
            } else if (arr1[x]<arr2[y]){
                x++;
            } else if (arr2[y]<arr3[z]){
                y++;
            } else {
                z++;
            }
        }
    }
}


// This is other methode

//import java.util.Arrays;
//import java.util.List;
//import java.util.Objects;
//import java.util.OptionalInt;
//import java.util.stream.IntStream;
//
//public class Arraythree {
//    static int SmallArray(int[] g) {
//        int[] s = g.clone();
//        Arrays.sort(s);
//
//        return s[0];
//    }
//
//    public static int findIndex(int arr[], int t) {
//        int len = arr.length;
//        return IntStream.range(0, len)
//                .filter(i -> t == arr[i])
//                .findFirst() // first occurrence
//                .orElse(-1); // No element found
//    }
//
//    public static void main(String[] args) {
//        int[] arr1 = {1, 5, 10, 20, 40 ,80};
//        int[] arr2 = {6, 7, 20, 80, 100};
//        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};
//
//        int m1 = arr1.length;
//        int m2 = arr2.length;
//        int m3 = arr3.length;
//
//        int[] g = {m1, m2, m3};
//
//        int s = SmallArray(g);
//        System.out.println(s);
//        int val = findIndex(g, s);
//        System.out.println(val);
//
//        int[] arr = {};
//
//        if(val==0) {
//            arr = arr1.clone();
//        } else if(val==1) {
//            arr = arr2.clone();
//        } else if(val==2) {
//            arr = arr3.clone();
//        }
//
//        String arr0 = Arrays.toString(arr);
//        System.out.println(arr0);
//
//        for(int i=0; i<s; i++) {
//            // I write code here after some time
//            boolean find = Objects.equals(arr1, arr[i]);
//            boolean find1 = Objects.equals(arr2, arr[i]);
//            boolean find2 = Objects.equals(arr3, arr[i]);
//            if (find & find1 & find2){
//                System.out.println("Elements --> "+ arr[i]);
//            }
//        }
//    }
//}
