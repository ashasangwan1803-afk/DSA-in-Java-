import java.util.*;
class Ternary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x: ");
        int x = sc.nextInt();
       
        System.out.print("enter y: ");
        int y = sc.nextInt();

        int max = x>y? x:y;
        System.out.println("maximum value is: " + max);
    }
}


