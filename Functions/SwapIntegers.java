import java.util.*;
class SwapIntegers{

    public static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + "," + b);
    }
    
    public static void main(String args[]){
        int a = 6;
        int b = 9;
        System.out.println(a + "," + b);

        Swap(a,b);
        
    }
}