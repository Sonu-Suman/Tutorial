package Array;

public class SecondSmallest {
    public static int Secondsmall(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for (int i=0; i< arr.length; i++){
            if (arr[i]<smallest){
                smallest = arr[i];
            }
            if(arr[i]>smallest && arr[i]<secondsmallest){
                secondsmallest = arr[i];
            }
        }
        return secondsmallest;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 7, 1, 3, 4, 18, 1, -1, -1};
        System.out.println(Secondsmall(arr));
    }
}
