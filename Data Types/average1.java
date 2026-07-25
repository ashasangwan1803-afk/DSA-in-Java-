import java.util.*;
class average1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of a: ");
        int a = sc.nextInt();

        System.out.print("enter value of b: ");
        int b = sc.nextInt();

        System.out.print("enter value of c: ");
        int c = sc.nextInt();
       
        double average = (a+b+c)/3.0;

        System.out.println("average is: " + average);

    }
}
