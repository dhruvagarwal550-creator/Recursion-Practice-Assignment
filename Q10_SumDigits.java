import java.util.Scanner;

public class Q10_SumDigits {
    // Returns the sum of all digits using recursion.
    static int sumDigits(long n) {
        if (n == 0) { // Base case; sum of digits of 0 is 0
            return 0;
        }
        return (int)(n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(sumDigits(n));
        sc.close();
    }
}
