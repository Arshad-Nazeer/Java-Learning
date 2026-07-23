import java.util.Scanner;

public class L11P_CompoundInterestCalculator {
    public static void main(String[] args) {
        // A = P × (1 + r / n)^(n × t)

        // A = Final amount
        // P = Principal (initial investment)
        // r = Annual interest rate (decimal)
        // n = Number of times interest is compounded per year
        // t = Time in years

        Scanner sc=new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal=sc.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate=sc.nextDouble() / 100; // 5% to 0.05

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded=sc.nextInt();

        System.out.print("Enter the number of years: ");
        years=sc.nextInt();

        amount=principal*Math.pow(1+rate/timesCompounded, timesCompounded*years);

        // System.out.println("The amount after " + years + " year(s) is $" + amount);
        System.out.printf("The amount after %d year(s) is $%.2f\n", years, amount);

        sc.close();
    }
}
