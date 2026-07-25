import java.util.Scanner;

public class L25_NestedLoops {
    public static void main(String[] args) {
        // nested loops :- a loop inside another loop
        // used often with matrices and DSA

        // printing 0-9 three times using nested loop instead of multiple loops
        for(int i=0; i<3; i++){
            for(int j=0; j<10; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // Matrix of Symbols
        Scanner sc = new Scanner(System.in);

        int rows, cols;
        char symbol;

        System.out.println("Enter the number of rows: ");
        rows=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        cols=sc.nextInt();
        System.out.println("Enter the symbol: ");
        symbol=sc.next().charAt(0);  // use charAt() to convert to char because next() returns a string

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        sc.close();
    }
}
