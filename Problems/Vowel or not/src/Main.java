import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'i':
            case 'u':
            case 'e':
            case 'o':
                return true;
            default:
                return false;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}