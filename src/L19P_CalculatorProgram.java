import java.util.Scanner;

public class L19P_CalculatorProgram {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       double num1, num2;
       char operator;
       double result=0;
       boolean valid=true;

        System.out.println("Enter the first number: ");
        num1=sc.nextDouble();

        System.out.println("Enter an operator (+, -, *, /, ^, %): ");
        operator = sc.next().charAt(0);  //
        // charAt convert the string input to char

        System.out.println("Enter the second number: ");
        num2=sc.nextDouble();

        switch(operator){
            case '+' -> result = num1+num2;
            case '-' -> result = num1-num2;
            case '*' -> result = num1*num2;
            case '/' -> {
                if(num2==0) {
                    System.out.println("Cannot divide by zero");
                    valid=false;
                }
                else result = num1 / num2;
            }
            case '^' -> result = Math.pow(num1,num2);
            case '%' -> result = num1%num2;
            default -> {
                System.out.println("Invalid Input");
                valid=false;
            }
        }

        if(valid )System.out.println(result);

       sc.close();
    }
}
