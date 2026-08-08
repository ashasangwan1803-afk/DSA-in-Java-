import java.util.*;
class building_from_array_elements1{
    public static void printBuildings(int[] heights) {
        int n = heights.length;

        // Find maximum height
        int maxHeight = heights[0];

        for (int i = 1; i < n; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
            }
        }

        // Print buildings
        for (int floor = maxHeight; floor >= 1; floor--) {
            for (int i = 0; i < n; i++) {
                if (heights[i] >= floor) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter building heights:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printBuildings(arr);
    }
}