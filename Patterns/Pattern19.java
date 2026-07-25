import java.util.*;
class Pattern19{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();

        int total_number_of_lines = n;
        int current_number_of_lines = 1;

        int stars = n;
        int spaces = 0;

        while(current_number_of_lines <= total_number_of_lines){
            for(int i=1; i<=spaces; i++){
                System.out.print("  ");
            }
            for(int i=1; i<=stars; i++){

                // upper half (except 1st line) should contain only first and last star
                if(current_number_of_lines != 1 && current_number_of_lines <= n/2 && i > 1 && i < stars){ 
                    // this term "current_number_of_lines != 1 && current_number_of_lines <= n/2" is for upper half except 1st line
                    // this term "i > 1 && i < stars" is for boundary line 

                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }

            if(current_number_of_lines <= n/2){
                stars -= 2;
                spaces++;
            }
            else{
                stars += 2;
                spaces--;
            }

            System.out.println();
            current_number_of_lines++;
        }
    }
}