import java.util.*;
class sum_of_digits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();


        int original_number = num;
        int sum = 0;


        while(num > 0){
            int last_digit = num % 10;
            sum = sum + last_digit;
            num = num / 10;
        }
        System.out.println("sum of digits = " + sum);
    }
}
