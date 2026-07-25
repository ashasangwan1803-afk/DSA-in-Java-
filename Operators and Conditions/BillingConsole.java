import java.util.*;
class BillingConsole{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.print("enter the cost of first object: ");
        double a = sc.nextDouble();


        System.out.print("enter the cost of second object: ");
        double b = sc.nextDouble();


        System.out.print("enter the cost of third object: ");
        double c = sc.nextDouble();


        double total = (a+b+c)/3;
        System.out.println("total bill: " + total);


        double gst = total * 0.18;
        System.out.println("gst " + gst);


        double total_bill = total + gst;
        System.out.println("total bill with gst: " + total_bill);
    }
}
