import java.util.*;
class AllSubarrays{
    public static void printAllSubarrays(int[] arr){
        int n = arr.length;

        for(int si=0; si<n; si++){ // si --> starting index
            for(int ei=si; ei<n; ei++){ // ei --> ending index 
                
                // print array from starting index (si) to ending index (ei)
                for(int k=si; k<=ei; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter elements of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        printAllSubarrays(arr);
    }
}
