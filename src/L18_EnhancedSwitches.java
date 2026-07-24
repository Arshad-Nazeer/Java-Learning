import java.util.Scanner;

public class L18_EnhancedSwitches {
    public static void main(String[] args) {

        // Enhanced Switches
        // A replacement to many else if statements (Java14 feature)

        // -> arrrow operator :- do this code

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String day = sc.nextLine();

        switch (day) {
            case "Monday" -> System.out.println("It is a weekday") ;
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is a weekend");
            case "Sunday" -> System.out.println("It is a weekend");
            default -> System.out.println(day+" is not a day");
        }

        // grouping identical branches
        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday");
            case "Saturday", "Sunday" -> System.out.println("It is a weekend");
            default -> System.out.println(day+" is not a day");
        }
    }
}
