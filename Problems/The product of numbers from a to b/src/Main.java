import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long result;

        long increment = b - a;

        if (increment <= 1) {
            result = a;
        } else {
            result = a;
            for (int i = 1; i <= (increment - 1); i++) {
                result = result * (a + i);
            }
        }
        System.out.println(result);




    }
}