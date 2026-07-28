public class L34_VarArgs {
    public static void main(String[] args) {
        // varargs(variable arguments) :-
        // allow a method to accept a varying number of arguments
        // makes methods more flexible
        // no need for overloaded methods
        // java will pack the arguments into an array
        // ... (ellipsis)

        System.out.println(add(1, 2, 3, 4, 5, 6));
        System.out.println(average(1, 2, 3, 4, 5, 6));
        System.out.println(add());
        System.out.println(average()); // dividing by zero
        // double division: 0.0/0.0 gives NaN
        // integer division: 0/0 throws ArithmeticException
    }

    static int add(int... numbers){
        int sum=0;
        for(int num: numbers)
            sum+=num;

        return sum;
    }

    static double average(double... numbers){
        double sum=0;
        for(double num: numbers) sum+=num;
        return sum/numbers.length;
    }
}
