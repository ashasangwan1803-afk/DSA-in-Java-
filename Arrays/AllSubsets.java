import java.util.*;
class AllSubsets {
    public static void printAllSubsets(int[] nums) {
        int n = nums.length;
        int totalSubsets = (int) Math.pow(2, n);

        for (int i = 0; i < totalSubsets; i++) { // outer loop
            String sub = "";

            // convert binary
            int current_num = i;
            for (int idx = n - 1; idx >= 0; idx--) { // inner loop
                int rem = current_num % 2;

                if (rem == 0) { // nums[idx] said no 
                    sub = "_, " + sub;
                } else { // nums[idx] said yes
                    sub = nums[idx] + " , " + sub; 
                }

                current_num /= 2;
            }
            System.out.println(sub);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printAllSubsets(arr);
    }
}