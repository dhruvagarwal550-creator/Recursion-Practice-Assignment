import java.util.Scanner;

public class Q12_CountDigits {
    // Counts digits recursively. The number 0 has one digit.
    static int countDigits(long n) {
        if (n < 10) { // Includes n = 0
            return 1;
        }
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(countDigits(n));
        sc.close();
    }
}
