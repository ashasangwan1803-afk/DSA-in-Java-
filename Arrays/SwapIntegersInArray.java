import java.util.*;
class SwapIntegersInArray{
    public static void swapInteger(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    public static void main(String args[]){
        
        int[] arr = new int[2];
        arr[0] = 3;
        arr[1] = 7;
        System.out.println("Before swapping: " + arr[0] + "," + arr[1]);

        swapInteger(arr);
        System.out.println("After swapping: " + arr[0] + "," + arr[1]);

    }
}