import java.util.Scanner;

public class Q2_PrintNTo1 {
    // Prints numbers from n down to 1 using recursion.
    static void printNumbers(int n) {
        if (n <= 0) { // Base case
            return;
        }

        System.out.print(n + " ");
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printNumbers(n);
        System.out.println();
        sc.close();
    }
}
