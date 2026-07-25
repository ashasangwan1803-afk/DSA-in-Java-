import java.util.*;
class Pattern16{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();

        int total_number_of_lines = 2*n+1;
        int current_number_of_lines = 1;

        int stars = 1;
        int spaces = n;
        int startNum = 1;

        while(current_number_of_lines <= total_number_of_lines){
            for(int i=1; i<=spaces; i++){
                System.out.print("\t");
            }
            int num = startNum;
            for(int i=1; i<=stars; i++){
                System.out.print(num + "\t");
                if(i <= stars/2){
                    num++;
                }
                else{
                    num--;
                }
                
            }
            if(current_number_of_lines <= n){
                stars += 2;
                spaces--;
                startNum++;
            }
            else{
                stars -= 2;
                spaces++;
                startNum--;
            }
            System.out.println();
            current_number_of_lines++;
        }
    }
}