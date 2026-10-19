import java.util.Scanner;

public class Q16_LCM {
    // Recursive GCD helper.
    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        // Divide first to reduce the chance of overflow.
        long lcm = (a / gcd(a, b)) * b;
        System.out.println(lcm);
        sc.close();
    }
}
