import java.util.Scanner;

public class Q8_StringPalindrome {
    // Checks matching characters from both ends using recursion.
    static boolean isPalindrome(String s, int left, int right) {
        if (left >= right) { // All character pairs matched
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (isPalindrome(s, 0, s.length() - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
