import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and exponent: ");
        double base = sc.nextDouble();
        double exponent = sc.nextDouble();
        System.out.printf("%.2f^%.2f = %.2f\n", base, exponent, Math.pow(base, exponent));
        sc.close();
    }
}