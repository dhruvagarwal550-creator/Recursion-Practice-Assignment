import java.util.Scanner;

public class Q4_PrintOdd {
    // Prints odd numbers from 1 to n in increasing order.
    static void printOdd(int n) {
        if (n < 1) { // Base case
            return;
        }

        printOdd(n - 2);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Start from the largest odd number not greater than n.
        if (n % 2 == 0) {
            n--;
        }
        printOdd(n);
        System.out.println();
        sc.close();
    }
}
