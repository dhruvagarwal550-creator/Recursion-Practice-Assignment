import java.util.Scanner;

public class Q7_ReverseString {
    // Returns the string in reverse order using recursion.
    static String reverse(String s) {
        if (s.length() <= 1) { // Base case
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(reverse(s));
        sc.close();
    }
}
