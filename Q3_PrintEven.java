import java.util.Scanner;

public class Q3_PrintEven {
    // Prints even numbers from 1 to n in increasing order.
    static void printEven(int n) {
        if (n < 2) { // No positive even number below 2
            return;
        }

        printEven(n - 2);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Start from the largest even number not greater than n.
        if (n % 2 != 0) {
            n--;
        }
        printEven(n);
        System.out.println();
        sc.close();
    }
}
