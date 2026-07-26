import java.util.*;
class RotateNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();

        System.out.print("rotate times: ");
        int k = sc.nextInt();

        int length = 0;
        int temp = num; // so that number is not lost

        while(temp > 0){ // for finding the length of number
            temp = temp / 10;
            length++;

        }
        k = k % length;
        if(k < 0){ // is k is negative
            k = k + length;
        }

        int div = (int)Math.pow(10,k);
        int mul = (int)Math.pow(10,length-k);

        int lastDigits = num % div;
        int frontDigits = num / div;

        int rotatedNumber = lastDigits * mul + frontDigits;
        System.out.println("Rotated Number is: " + rotatedNumber);
    }
}
