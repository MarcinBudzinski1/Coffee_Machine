import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int l = input.nextInt();

        int[] a = new int[l];

        int i = 0;
        while (i < l) {
            a[i++] = input.nextInt();
        }

        int n = input.nextInt();

        int t = 0;
        i = 0;
        while (i < l) {
            if (a[i++] == n) {
                t++;
            }
        }

        System.out.println(t);
    }
}