import java.util.*;
class GreaterThanX{
    public static int countElementGreaterThanX(int[] arr, int x){
        int count = 0;

        for(int i=0; i<arr.length; i++){
            int element = arr[i];

            if(element > x){
                count++;
            }
        }
        return count;
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

        System.out.print("enter value of x: ");
        int x = sc.nextInt();
        int result = countElementGreaterThanX(arr, x);
        System.out.println("number of elements greater than x: " + result);
    }
}