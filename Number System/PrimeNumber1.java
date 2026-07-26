import java.util.*;
class PrimeNumber1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();


        int factor_count = 0;
        for(int div=1; div<=num; div++){
            if(num % div == 0){
                factor_count++;
            }
        }
        if(factor_count == 2){
            System.out.println("The given number is a prime number");
        }
        else{
            System.out.println("The given number is not a prime number");
        }
    }
}
