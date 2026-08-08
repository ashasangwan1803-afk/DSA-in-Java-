import java.util.*;
class building_from_array_elements2{
    public static void printBuildings(int[] heights) {
        int n = heights.length;

        // Find maximum height
        int maxHeight = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int currBuildingHeight = heights[i];
            maxHeight = Math.max(maxHeight, currBuildingHeight);
        }
        int currFloor = maxHeight;

        // Print building floor by floor
        while (currFloor > 0) {
            for (int i = 0; i < n; i++) {
                int currBuildingHeight = heights[i];
                if (currFloor <= currBuildingHeight) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            currFloor--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of buildings
        System.out.print("Enter number of buildings: ");
        int n = sc.nextInt();

        // Array creation
        int[] heights = new int[n];

        // Input heights
        System.out.println("Enter height of each building:");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        System.out.println("\nBuilding Pattern:\n");
        printBuildings(heights);
    }
}