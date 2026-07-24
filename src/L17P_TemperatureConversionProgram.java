import java.util.Scanner;

public class L17P_TemperatureConversionProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp=sc.nextDouble();

        System.out.print("Convert to celsius or fahrenheit? (C or F): ");
        unit=sc.next().toUpperCase();

        newTemp = unit.equals("C") ? (temp-32)*(5.0/9.0) : (temp*(9.0/5.0)+32);

        System.out.printf("%.2f° %s", newTemp, unit);

        sc.close();
    }
}
