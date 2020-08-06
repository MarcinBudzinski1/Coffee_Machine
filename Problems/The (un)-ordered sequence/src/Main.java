import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int old;

        boolean rordered = true;
        boolean lordered = true;

        while (true) {
            old = num;
            num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            if (rordered && num < old) {
                rordered = false;
                continue;
            }

            if (lordered && num > old) {
                lordered = false;
                continue;
            }

            if (!rordered && !lordered) {
                break;
            }
        }

        System.out.println(lordered || rordered);
    }
}