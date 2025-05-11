import java.util.Scanner;

public class Fibonacci {
    static void fibonacci(int n) {
        int a = 0, b = 1, c;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        fibonacci(n);
        sc.close();
    }
}