import java.util.Scanner;

public class Q1_Print1ToN {
    // Prints numbers from 1 to n using recursion.
    static void printNumbers(int n) {
        if (n == 0) { // Base case
            return;
        }

        printNumbers(n - 1); // Print smaller numbers first
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printNumbers(n);
        System.out.println();
        sc.close();
    }
}
