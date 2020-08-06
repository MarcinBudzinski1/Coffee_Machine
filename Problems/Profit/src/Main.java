import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextInt();
        double p = scanner.nextInt();
        double k = scanner.nextInt();

        int years = 0;
        double i = m;
        while (i < k) {
            i = i + (i / 100 * p);
            years++;
        }
        System.out.println(years);
    }
}