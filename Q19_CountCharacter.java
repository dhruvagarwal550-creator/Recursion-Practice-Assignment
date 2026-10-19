import java.util.Scanner;

public class Q19_CountCharacter {
    // Counts occurrences of the target character from the given index.
    static int count(String s, char target, int index) {
        if (index == s.length()) {
            return 0;
        }

        int current = (s.charAt(index) == target) ? 1 : 0;
        return current + count(s, target, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char target = sc.nextLine().charAt(0);

        System.out.println(count(s, target, 0));
        sc.close();
    }
}
