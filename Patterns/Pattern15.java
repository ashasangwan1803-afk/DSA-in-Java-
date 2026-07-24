import java.util.*;
class Pattern15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();

        int total_number_of_lines = n;
        int current_number_of_lines = 1;

        int stars = 1;
        int second_last_term = 1; // first term
        int last_term = 1; // second term 

        while(current_number_of_lines <= total_number_of_lines){
            for(int i=1; i<=stars; i++){
                System.out.print(second_last_term + "\t");
                int current_term = second_last_term + last_term; // third term 
                second_last_term = last_term;
                last_term = current_term; 
            }
            System.out.println();
            stars++;
            current_number_of_lines++;
        }
    }
}