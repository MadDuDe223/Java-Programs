import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter annual interest rate (in %): ");
        double rate = sc.nextDouble();
        System.out.print("Enter time in years: ");
        double time = sc.nextDouble();
        System.out.print("Enter number of times interest is compounded per year: ");
        int n = sc.nextInt();
        
        rate = rate / 100;
        double compoundInterest = principal * Math.pow(1 + rate/n, n*time) - principal;
        
        System.out.println("Compound Interest: " + compoundInterest);
        sc.close();
    }
}