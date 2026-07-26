import java.util.*;
class ReverseNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();
        int original = num; // store original number


        int reversedNumber = 0;
        while(num > 0){
            int lastDigit = num % 10; // fetch last digit
            reversedNumber = reversedNumber * 10 + lastDigit;


            num = num / 10; // remove last digit
        }
        System.out.println("Reverse of " + original + " number is " + reversedNumber);
    }
}
