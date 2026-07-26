import java.util.*;
class InverseNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();


        int original = num;
        int InversedNum = 0;
        int position = 1;
        while(num > 0){
            int lastDigit = num % 10;


            int multiplier = (int)Math.pow(10, lastDigit - 1);
            InversedNum = InversedNum + (position*multiplier);


            num = num / 10;
            position++;


            /* Math.pow(base, exponent) hamesha double
            return karta hai, chahe answer ek integer
            hi kyu na ho. (int) is code mein type
            casting ke liye use hua hai. */
        }
        System.out.println("the inverse of a given number is: " + InversedNum);
    }
}
