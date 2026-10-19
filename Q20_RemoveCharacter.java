import java.util.Scanner;

public class Q20_RemoveCharacter {
    // Removes every occurrence of target using recursion.
    static String remove(String s, char target) {
        if (s.length() == 0) {
            return "";
        }

        char first = s.charAt(0);
        String rest = remove(s.substring(1), target);

        if (first == target) {
            return rest;
        }
        return first + rest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char target = sc.nextLine().charAt(0);

        System.out.println(remove(s, target));
        sc.close();
    }
}
