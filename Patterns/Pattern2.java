import java.util.*;
class Pattern2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();


        int total_number_of_lines = n;
        int current_number_of_lines = 1;
        int stars = n;
       
        while(current_number_of_lines <= total_number_of_lines){
            for(int i=1; i<=stars; i++){
                System.out.print("* ");
            }
            System.out.println();
            stars--;
            current_number_of_lines++;
        }
    }
}
