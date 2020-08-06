import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();

        int crsh = 1;
        for (; crsh < numberOfBridges; crsh++) {
            int bridge = scanner.nextInt();
            if (busHeight >= bridge) {
                break;
            }
        }
        if (crsh != numberOfBridges) {
            System.out.print("Will crash on bridge " + crsh);
        } else {
            System.out.print("Will not crash");
        }
    }
}