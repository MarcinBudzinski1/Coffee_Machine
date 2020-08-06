import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var input = scanner.next();

        var result = "";

        switch (input) {
            case "triangle":
                var a = scanner.nextDouble();
                var b = scanner.nextDouble();
                var c = scanner.nextDouble();
                var p = (a + b + c) / 2;
                result += Math.sqrt(p * (p - a) * (p - b) * (p - c));
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                result += a * b;
                break;
            case "circle":
                a = scanner.nextDouble();
                result += a * a * 3.14;
                break;
            default:
                break;
        }
        System.out.println(result);
    }
}