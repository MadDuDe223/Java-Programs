import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++)
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        sc.close();
    }
}