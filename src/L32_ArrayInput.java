import java.util.Scanner;

public class L32_ArrayInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // invalid :- size of array needs to be declared beforehand to insert elements in an empty array
        // String[] foods = {};
        // foods[0]="pizza";
        // System.out.println(foods.length);

        // declaring with size
        String[] foods = new String[3];
        // LHS :- declaration
        // declares name of the reference variable to an array of specified type
        // RHS :- Object creation, Returns a reference to that object.
        // new= Allocate memory on the heap and create a new object
        // Create an array that can hold 3 String references.

        foods[0]="pizza";
        foods[1]="pineapple";
        foods[2]="hamburger";

        for(String food: foods) System.out.println(food);

        // input
        String[] foods2;

        System.out.print("Enter the number of food: ");
        int size=sc.nextInt();
        sc.nextLine(); // to clear input buffer

        foods2=new String[size];
        for(int i=0; i<foods2.length; i++){
            System.out.print("Enter a food: ");
            foods2[i]=sc.nextLine();
        }

        for(String food: foods2) System.out.println(food);

        sc.close();
    }
}
