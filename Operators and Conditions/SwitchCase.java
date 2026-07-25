import java.util.*;
class SwitchCase{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter day: ");
        int day = sc.nextInt();


        switch(day){
            case 1:
                System.out.println("today is monday");
                break; // agar break nhi likha toh ye jo case true hua uske aad wali saari statement ko true man kar print kar dega
            case 2:
                System.out.println("today is tuesday");
                break;
            case 3:
                System.out.println("today is wednesday");
                break;
            case 4:
                System.out.println("today is thursday");
                break;
            case 5:
                System.out.println("today is friday");
                break;
            case 6:
                System.out.println("today is saturday");
                break;
            case 7:
                System.out.println("today is sunday");
                break;
            default:
                System.out.println("no such day of week");
                break;        
        }
    }
}
