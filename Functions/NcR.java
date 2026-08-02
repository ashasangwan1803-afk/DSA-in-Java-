import java.util.*;
class NcR{

    // finding factorial 
    public static int findFactorial(int num){
        int res = 1;
        for(int mul=1; mul<=num; mul++){
            res = res*mul;
        }
        return res;
    }

    public static int NcR(int n, int r){
        int nFac = findFactorial(n);
        int rFac = findFactorial(r);
        int nmrFac = findFactorial(n-r);

        int ncr = nFac/(rFac*nmrFac);
        return ncr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();

        System.out.print("enter r: ");
        int r = sc.nextInt();
        int res = NcR(n,r);

        System.out.println("Result is: " + res);
    }
}