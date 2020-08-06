import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        boolean ascend = true;
        int[] n = new int[len];
        for (int i = 0; i < len; i++) {
            n[i] = scanner.nextInt();
        }
        for (int j = 0; j < len - 1; j++) {
            if (n[j] >= n[j + 1]) {
                ascend = false;
            }
        }
        System.out.println(ascend);
    }
}