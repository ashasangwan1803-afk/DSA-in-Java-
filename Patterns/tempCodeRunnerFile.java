import java.util.*;
class Pattern21{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();

        int total_number_of_lines = n;
        int current_number_of_lines = 1;

        int stars = 1;
        int spaces = 2;

        while(current_number_of_lines <= total_number_of_lines){
            for(int i=1; i<=spaces; i++){
                System.out.print("  ");
            }
            for(int i=1; i<=stars; i++){
                System.out.print("* ");
            }
            if(current_number_of_lines <= n/2){
                stars++;
            }
            else{
                stars--;
            }
            
            System.out.println();
            current_number_of_lines++;

        }
    }
}