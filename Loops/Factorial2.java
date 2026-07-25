import java.util.*;
class Factorial2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();


        long res = 1;
        for(int mul=1; mul<=n; mul++){
            res = res*mul;
        }
        System.out.println("factorial of " + n + " is " + res);
    }
}
