import java.util.*;
class example{
    public static void doNothing(int a, char x){
        System.out.println("Do Nothing");
        System.out.println(a + "," + x);
    }
    public static void main(String args[]){
        int a = 5; // we didn't use it anywhere
        doNothing(56, '$'); // ab ye upar wale function ke pass jayega
        System.out.println("End of main function");
    }
}
