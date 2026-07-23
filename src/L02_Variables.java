public class L02_Variables {
    public static void main(String[] args) {
        // variable:-
        // a reusable container for a value
        // a variable behaves as if it was the value it contains

        // primitive :- simple value stored directly in memory (stack)
        // byte, short, int, long, float, double, char, boolean
        // Reference :- memory address (stack) that points to the (heap)
        // String, Arrays, Classes (Objects), Interfaces, Enums, Wrapper Classes, Records

        // creating a variable :-
        // declaration
        // assignment

        int age;
        age=21;
        System.out.println(age);

        int year=2025;
        System.out.println("The year is "+year);

        double price=19, gpa=3.5, temperature=-12.5;
        System.out.println("$ "+price);
        System.out.println(gpa);
        System.out.println(temperature);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);

        boolean isStudent = true;
        boolean isForSale = false;
        System.out.println(isForSale);

        if(isStudent==true){
            System.out.println("You are a Student");
        }else{
            System.out.println("You are not a Student");
        }

        String name="Arshad"; // a series of characters
        System.out.println("Hello! "+name);
        String food = "pizza";
        System.out.println("Your favorite food is "+food);

        System.out.println("You are "+age+" years old");
        System.out.println("Your gpa is: "+gpa);

        String color="red", car="Mustang";
        System.out.println("Your choice is a "+color+" "+year+" "+car);
        System.out.println("The price is: "+currency+price);

        if(isForSale)
            System.out.println("The "+car+" is for sale");
        else
            System.out.println("The "+car+" is not for sale");
    }
}
