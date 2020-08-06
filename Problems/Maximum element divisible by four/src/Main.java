import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int i;
        int[] arr = new int[1000];
        for (i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr, 0, size);

        for (i = size - 1; i >= 0; i--) {
            if (arr[i] % 4 == 0) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}