import java.util.*;
class SpanOfArray{
    public static int findSpan(int[] arr){
        if(arr.length == 0){ // edge case  
            return -1;
        }
        int max = Integer.MIN_VALUE; // -10^9 or int max = arr[0];
        int min = Integer.MAX_VALUE; // 10^9 or int min = arr[n-1];

        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            if(element > max){
                max = element;
            }

            if(element < min){
                min = element;
            }
        }
        int span = max - min;
        return span;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("enter " + size + " elements of array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int result = findSpan(arr);
        System.out.println("span (max - min): " + result);
    }
}