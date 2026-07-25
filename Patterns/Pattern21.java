import java.util.*;
class Pattern21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Upper Part
        for (int i=1; i<=n/2; i++) {

            // Spaces
            for (int j=1; j<=n/2; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Middle Line
        for (int j=1; j<=n; j++) {
            System.out.print("* ");
        }
        System.out.println();

        // Lower Part
        for (int i=n/2; i>=1; i--) {

            // Spaces
            for (int j=1; j<=n/2; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}