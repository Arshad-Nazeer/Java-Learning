package L68_Enums;

import java.sql.SQLOutput;
import java.util.Scanner;

public class L68_Enums {
    public static void main(String[] args) {
        // Enums (Enumerators)
        // A special kind of class that represents a fixed set of constants
        // An enum is a special class that contains a fixed set of constant objects. These objects are created automatically by the JVM when the enum is initialized, and you cannot instantiate any additional objects of that enum
        //  Enums are used when a variable should only have one value from a fixed set of constants. Unlike String, which can store any value, or int, which does not clearly indicate what a value represents, an enum restricts the variable to predefined constant objects, making the code more readable, type-safe, and less prone to errors.
        // They improve code readability and are easy to maintain
        // more efficient with switches rather than comparing Strings

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String response=sc.nextLine().toUpperCase();

        try{
            // valueOf() converts a string into an enum constant.
            // If the string isn't one of the enum names, throws IllegalArgumentException
            Day day1 = Day.valueOf(response);
            System.out.println(day1);

            // you don't need to use double quotes like string when working with enum
            switch (day1) {
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It is a weekday");
                case SATURDAY,
                     SUNDAY -> System.out.println("It is a weekend");

            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.out.println("Please Enter a valid day!");
        }


        // Make the variable day refer to the already existing SUNDAY object.
        Day day = Day.SUNDAY;
        System.out.println(day);
        System.out.println(day.getDayNumber());

        System.out.println(Day.values());
        System.out.println(Day.MONDAY.ordinal());     // 1 (zero-based position));
    }
}
