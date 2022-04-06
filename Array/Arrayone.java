package Array;

import java.util.*;

/* Java program to find the duplicate array:
input = {1, 2, 5, 4, 2, 1, 4, 7}
Output = (1, 4}

we are going to use set data structure.
Set data structure is unordered collection of object and set is not allow enter duplicate element.
Set is an interface and it is implimented by Hashset, LinkedList, or Treeset class
*/



public class Arrayone {
    static List<Integer> DuplicateElement(int[] arr){
        Set<Integer> NonDuplicateElement = new HashSet<>();
//        boolean isDuplicate = false;
        List<Integer> l = new Stack<>();

        for (int j : arr) {
            if (NonDuplicateElement.contains(j)) {
//                isDuplicate = true;
                l.add(j);
            } else {
                NonDuplicateElement.add(j);
            }
        };
        return l;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 2, 1, 4, 7};
        System.out.println(DuplicateElement(arr));
    }
}
