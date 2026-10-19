import java.util.Scanner;

public class Q5_SumNaturalNumbers {
    // Returns 1 + 2 + ... + n using recursion.
    static long sum(int n) {
        if (n <= 0) { // Base case
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sum(n));
        sc.close();
    }
}
