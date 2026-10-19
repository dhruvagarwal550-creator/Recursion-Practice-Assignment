import java.util.Scanner;

public class Q21_ReplaceCharacter {
    // Replaces target with replacement using recursion.
    static String replace(String s, char target, char replacement) {
        if (s.length() == 0) {
            return "";
        }

        char first = s.charAt(0);
        if (first == target) {
            first = replacement;
        }
        return first + replace(s.substring(1), target, replacement);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char target = sc.next().charAt(0);
        char replacement = sc.next().charAt(0);

        System.out.println(replace(s, target, replacement));
        sc.close();
    }
}
