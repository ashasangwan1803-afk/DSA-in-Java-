import java.util.*;
class MarkSheetBot{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter marks: ");
        int marks = sc.nextInt();
        if(90 < marks){
            System.out.println("excellent");
        }
        else if(80 <= marks){
            System.out.println("very good");
        }
        else if(60 <= marks){
            System.out.println("good");
        }
        else if(45 <= marks){
            System.out.println("average");
        }
        else if(33 <= marks){
            System.out.println("can do better");
        }
        else {
            System.out.println("work hard");
        }
    }
}
