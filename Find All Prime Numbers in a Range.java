import java.util.Scanner;

public class PrimeRange {
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers (start and end): ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.print("Prime numbers between " + start + " and " + end + " are: ");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        sc.close();
    }
}