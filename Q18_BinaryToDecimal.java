import java.util.Scanner;

public class Q18_BinaryToDecimal {
    // Reads one binary digit at a time and builds its decimal value.
    static long toDecimal(String s, int index) {
        if (index == s.length()) {
            return 0;
        }
        int digit = s.charAt(index) - '0';
        return digit * powerOfTwo(s.length() - index - 1)
                + toDecimal(s, index + 1);
    }

    // Calculates 2 raised to a non-negative power recursively.
    static long powerOfTwo(int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return 2 * powerOfTwo(exponent - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(toDecimal(s, 0));
        sc.close();
    }
}
