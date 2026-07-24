import java.util.*;
class Pattern5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();

        int total_number_of_lines = 2*n+1;
        int current_number_of_lines = 1;
        int spaces = n;
        int stars = 1;

        while(current_number_of_lines <= total_number_of_lines){
            for(int i=1; i<=spaces; i++){
                System.out.print("  ");
            }

            for(int i=1; i<=stars; i++){
                System.out.print("* ");
            }

            if(current_number_of_lines <= n){
                spaces--;
                stars += 2;
            }
            else{
                spaces++;
                stars -= 2;
            }
            System.out.println();
            current_number_of_lines++;

        }
    }
}