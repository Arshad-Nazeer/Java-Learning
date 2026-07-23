public class printf {
    public static void main(String[] args){

        // printf :- is a method used to format output
        // %[flags][width][.precision][specifier-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with %c\n", firstLetter);
        System.out.printf("you are %d years old\n", age);
        System.out.printf("You are %f cm tall\n", height);
        System.out.printf("Employed: %b", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);

        double price1=90000.999;
        double price2=10000.153;
        double price3=-54.017;

        System.out.printf("%.7f\n%.2f\n%.0f\n", price1, price2, price3);

        // [flags] :-
        // + :- output a plus for +ve numbers
        // , = comma grouping separator at thousandth places, useful for displaying prices
        // ( = negative numbers are enclosed in ()
        // space = displays minus if negative, space if positive, good for aligning numbers

        System.out.println("\n+ flag");
        System.out.printf("%+.2f\n", price1);
        System.out.printf("%+.2f\n", price2);
        System.out.printf("%+.2f\n", price3); // still negative

        System.out.println("\n, flag");
        System.out.printf("%,.2f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%,.2f\n", price3);

        System.out.println("\n( flag");
        System.out.printf("%(.2f\n", price1);
        System.out.printf("%(.2f\n", price2);
        System.out.printf("%(.2f\n", price3);

        System.out.println("\nspace flag");
        System.out.printf("% .2f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);

        // [width]
        // 0 :- zero padding
        // number :- right justified padding
        // negative number :- left justified padding, zero padding cannot be used with it

        int id1=1, id2=23, id3=456, id4=7890;

        System.out.printf("\n%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        // pads with space
        System.out.printf("\n%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        System.out.printf("\n%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);

        double num = -1234.56789;
        System.out.printf("%(012.2f", num);
    }
}
