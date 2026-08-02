// QUESTION 4 → CONVERT BINARY TO DECIMAL
import java.util.*;
class BinaryToDecimal{
    public static int convertDecimal(int binaryNum){
        int res = 0;
        int pow2 = 1; // initially power of 2 is zero which is equal to 1
        while(binaryNum > 0){
            // find last digit
            int lastDigit = binaryNum % 10;


            // convert to binary
            int binary = lastDigit * pow2;
            res = res + binary;


            // remove last digit
            binaryNum = binaryNum / 10;
            pow2 = pow2 * 2;


        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter binary num: ");
        int binaryNum = sc.nextInt();


        int decimalNum = convertDecimal(binaryNum);
        System.out.println("Decimal number is: " + decimalNum);
    }
}
