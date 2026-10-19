import java.util.Scanner;

public class Q26_RecursiveBinarySearch {
    // Finds the first occurrence of target in a sorted array.
    static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            // Search left half for an earlier occurrence.
            int earlier = binarySearch(arr, target, left, mid - 1);
            if (earlier != -1) {
                return earlier;
            }
            return mid;
        } else if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, right);
        } else {
            return binarySearch(arr, target, left, mid - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(binarySearch(arr, target, 0, n - 1));
        sc.close();
    }
}
