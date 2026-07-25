import java.util.*;
class average2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("enter value of c: ");
        double c = sc.nextDouble();
       
        double average = (a+b+c)/3;

        System.out.println("average is: " + average);

    }
}


