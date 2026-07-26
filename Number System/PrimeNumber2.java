import java.util.*;
class PrimeNumber2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();


        int factor_count = 0;
        for(int div=1; div<=n; div++){
            if(n % div == 0){
                factor_count++;
            }
            if(factor_count > 2){
                break; // early exit
            }
        }
        if(factor_count == 2){
            System.out.println("the given number is a prime number");
        }
        else{
            System.out.println("the given number is not a prime number");
        }
    }
}
