import java.util.*;
class Pattern20{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0 || j==n-1){
                    System.out.print("* ");
                }
                else if(i>=n/2 && (i==j || i+j==n-1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
    }
}