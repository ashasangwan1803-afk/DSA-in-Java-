import java.util.*;
class number_of_digits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();
        int count = 0;


        // iss code m ik problem ye hai hai ki hamara original number 0 ho jayega in the end
        while(num > 0){
            num = num / 10;
            count++;
        }
        System.out.println("number of digits in given number is: " + count);
    }
}
