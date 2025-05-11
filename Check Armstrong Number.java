import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int original = num, remainder, n = 0, result = 0;
        
        while (original != 0) {
            original /= 10;
            n++;
        }
        
        original = num;
        while (original != 0) {
            remainder = original % 10;
            result += Math.pow(remainder, n);
            original /= 10;
        }
        
        if (result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
        sc.close();
    }
}