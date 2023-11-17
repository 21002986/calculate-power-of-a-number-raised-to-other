import java.util.Scanner;

public class Main {
    static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        double result = power(base, exponent);
        System.out.println(base + "^" + exponent + " is: " + result);
        scanner.close();
    }
}
