import java.util.*;
class Pattern12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();

        int total_number_of_lines = n;
        int current_number_of_lines = 1;
        int stars = 1;
        int outer_spaces = n/2;
        int inner_spaces = -1;

        while(current_number_of_lines <= total_number_of_lines){

            // print outer spaces
            for(int i=1; i<=outer_spaces; i++){
                System.out.print("  ");
            }

            // print stars stars
            System.out.print("* ");

            // print inner spaces
            for(int i=1; i<=inner_spaces; i++){
                System.out.print("  ");
            }

            // print one stars (not in 1st and last line)
            if(current_number_of_lines != 1 && current_number_of_lines != total_number_of_lines){
                System.out.print("* ");
            }

            if(current_number_of_lines <= n/2){
                outer_spaces--;
                inner_spaces += 2;
            }
            else{
                outer_spaces++;
                inner_spaces -= 2;
            }
            System.out.println();
            current_number_of_lines++;
        }
    }
}