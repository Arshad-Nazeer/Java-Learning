public class L26_Methods {
    public static void main(String[] args){
        // method :-
        // a block of reusable code that is executed when called ()

        String name="Arshad";
        int age=25;

        // to sing Happy Birthday song 3 times
        happyBirthday(name, age);
        happyBirthday(name, age);
        happyBirthday(name, age);

        double result=square(15);
        System.out.println(result);

        System.out.println(cube(15));

        String fullName=getFullname(name, "Nazeer");
        System.out.println(fullName);

        if(ageCheck(age))
            System.out.println("You may sign up!");
        else
            System.out.println("You must be 18+ to sign up");
    }

    // static means the method belongs to the class, not to an object.
    //Since main() is static, it can directly call only other static methods.
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday Dear "+name);
        System.out.printf("You are %d years old\n", age);
        System.out.println("Happy Birthday to you!");
    }

    static double square(double num){
        return num*num;
    }

    static double cube(double num){
        return num*num*num;
    }

    static String getFullname(String first, String last){
        return first+" "+last;
    }

    static boolean ageCheck(int age){
        return age>=18;
    }
}
