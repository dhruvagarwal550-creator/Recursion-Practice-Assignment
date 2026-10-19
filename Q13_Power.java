import java.util.Scanner;

public class Q13_Power {
    // Calculates a raised to the power b using recursion.
    static long power(long a, int b) {
        if (b == 0) { // Any number to the power 0 is 1
            return 1;
        }
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int b = sc.nextInt();

        System.out.println(power(a, b));
        sc.close();
    }
}
