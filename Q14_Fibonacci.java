import java.util.Scanner;

public class Q14_Fibonacci {
    // Returns the Fibonacci term at index n: 0, 1, 1, 2, ...
    static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Print the first n terms, starting at index 0.
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i));
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        sc.close();
    }
}
