import java.util.*;
class index_of_target_element{
    public static int findTarget(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
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
        System.out.print("enter target: ");
        int target = sc.nextInt();

        int result = findTarget(arr, target);
        System.out.print("index of target element: " + result);
    }
}