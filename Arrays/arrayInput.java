import java.util.*;
class arrayInput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] arr = new int[size];

        System.out.println("enter input: ");
        for(int i=0; i<arr.length; i++){
            int input = sc.nextInt();
            arr[i] = input;
        }
        
        System.out.println("output is: ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}