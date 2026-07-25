import java.util.*;
class Pattern17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();

        int total_number_of_lines = n;
        int current_number_of_lines = 1;
        int stars = 1;
        int spaces = 2*n-3;

        while(current_number_of_lines <= total_number_of_lines){

            int num = 1; 
            for(int i=1; i<=stars; i++){
                System.out.print(num + "\t");
                num++;
            }
            num--; // we are ahead one step, taking this step back

            for(int i=1; i<=spaces; i++){
                System.out.print("\t");
            }
            
            if(current_number_of_lines == total_number_of_lines){ // in last line one less star
                stars--;
                num--; // kyuki last line m stars kam the 
            }
            for(int i=1; i<=stars; i++){ 
                System.out.print(num + "\t");
                num--;
               
            }
            System.out.println();
            stars++;
            spaces -= 2;
            current_number_of_lines++;
        }
    }
}