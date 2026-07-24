import java.util.*;
class Pattern13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();

        int total_number_of_lines = n;
        int current_number_of_lines = 1;

        int stars = 1;
        int num = 1;

        while(current_number_of_lines <= total_number_of_lines){
            for(int i=0; i<stars; i++){
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
            stars++;
            current_number_of_lines++;
        }
    }
}
