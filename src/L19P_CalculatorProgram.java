import java.util.Scanner;

public class L19P_CalculatorProgram {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       double num1, num2;
       char operator;
       double result;

        System.out.println("Enter the first number: ");
        num1=sc.nextDouble();

        System.out.println("Enter an operator (+, -, *, /, ^): ");
        operator = sc.next().charAt(0);  //
        // charAt convert the string input to char

        System.out.println("Enter the second number: ");
        num2=sc.nextDouble();

       sc.close();
    }
}
