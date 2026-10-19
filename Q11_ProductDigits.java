import java.util.Scanner;

public class Q11_ProductDigits {
    // Returns the product of digits. The product for input 0 is 0.
    static long productDigits(long n) {
        if (n == 0) { // Special case required by the assignment
            return 0;
        }
        if (n < 10) { // Last remaining digit
            return n;
        }
        return (n % 10) * productDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(productDigits(n));
        sc.close();
    }
}
