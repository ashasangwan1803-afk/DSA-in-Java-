import java.util.*;
class arrayBasic{
    public static void main(String args[]){
        int[] arr;
        arr = new int[5];

        arr[0] = 24;
        arr[3] = 43;
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}