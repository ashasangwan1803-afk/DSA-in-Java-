import java.util.*;
class AddTwoArrays {
    public static void printAddTwoArrays(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int max = Math.max(n, m);
        int result[] = new int[max + 1];

        int i = n - 1;
        int j = m - 1;
        int k = max;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) {
                sum = sum + arr1[i];
                i--;
            }

            if (j >= 0) {
                sum = sum + arr2[j];
                j--;
            }

            result[k] = sum % 10;
            carry = sum / 10;
            k--;
        }
        result[k] = carry;

        // Leading zero ko skip karna
        int start = 0;

        if (result[0] == 0) {
            start = 1;
        }

        System.out.print("Output = ");
        for (int x = start; x < result.length; x++) {
            System.out.print(result[x] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        // 1st array
        System.out.print("Enter 1st array size: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter elements of 1st array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // 2nd array
        System.out.print("Enter 2nd array size: ");
        int m = sc.nextInt(); // hum denge 
        int arr2[] = new int[m]; // 0 to m-1 index aayenge or un sabki value hogi 0
        System.out.println("Enter elements of 2nd array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt(); // 0 to m-1 index ko hum value assign kar rhe honge 
        }

        printAddTwoArrays(arr1, arr2); 
    }
}

