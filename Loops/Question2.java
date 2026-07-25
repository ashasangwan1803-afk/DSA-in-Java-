import java.util.*;
class Question2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter total number of test cases: ");
        int testCases = sc.nextInt();


        while(testCases > 0){
            System.out.print("enter number: ");
            int num = sc.nextInt();
            if(num%2==0){
                System.out.println("number is even");
            }
            else{
                System.out.println("number is odd");
            }
            System.out.println();
            testCases--;
        }


    }
}
