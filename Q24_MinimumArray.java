import java.util.Scanner;

public class Q24_MinimumArray {
    // Finds the minimum from index onward.
    static int minimum(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        int minOfRest = minimum(arr, index + 1);
        if (arr[index] < minOfRest) {
            return arr[index];
        }
        return minOfRest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(minimum(arr, 0));
        sc.close();
    }
}
