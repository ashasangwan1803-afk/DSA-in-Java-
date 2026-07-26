import java.util.*;
class fibonacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter term: ");

        int n = sc.nextInt();
        int second_last_term = 0;
        int last_term = 1;
   
        // because we have already 2 terms, so to reach Nth term, we travel n-2 times
        // this code does't give correct answer for n = 1\
        for(int i=1; i<=n-2; i++){ // we can also use (int i=2; i<n; i++)
           
            int current_term = second_last_term + last_term;
            second_last_term = last_term;
            last_term = current_term;
        }
        System.out.println(n + " th term of fibonacci is = " + last_term);
    }
}
