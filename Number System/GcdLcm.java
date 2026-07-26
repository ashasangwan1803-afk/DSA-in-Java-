// GCD = Greatest Common Divisor
// LCM = Least Common Multiple
// HCF = Highest Common Factor
// GCD = HCF
import java.util.*;
class GcdLcm{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number1 : ");
        int num1 = sc.nextInt();

        System.out.print("enter number2 : ");
        int num2 = sc.nextInt();

        int a = num1;
        int b = num2;
        while(a>0){
            int rem = b % a;
            b = a;
            a = rem;
        }
        int gcd = b;
        int lcm = (num1*num2)/gcd;

        System.out.println("gcd and lcm of given numbers is: " + gcd + "," + lcm);
    }
}
