import java.util.Scanner;

public class Q17_DecimalToBinary {
    // Prints binary digits from most significant to least significant.
    static void printBinary(long n) {
        if (n > 1) {
            printBinary(n / 2);
        }
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n == 0) {
            System.out.println(0);
        } else {
            printBinary(n);
            System.out.println();
        }
        sc.close();
    }
}
