import java.util.Arrays;

public class L31_Arrays {
    public static void main(String[] args) {
        // array :-
        // a collection of values of the same data type
        // think og it as a variable that can store more than 1 value

        // add square brackets after data type
        // use curly brackets for elements
        String[] fruits = {"apple", "orange", "banana", "coconut"}; //array of strings

        System.out.println(fruits);
        // prints array object's string representation
        // return a memory address (reference) that points to the heap

        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);

        fruits[0]="pinepapple";
        System.out.println(fruits[0]);

        int numOfFruits=fruits.length;
        System.out.println(numOfFruits);

        for(int i=0; i<fruits.length; i++){
            System.out.print(fruits[i]+" ");
        }
        System.out.println();

        // Arrays class provide methods for array
        Arrays.sort(fruits);

        // enhanced for loop (forEach loop)
        for(String fruit: fruits){
            System.out.println(fruit);
        }

        // to fill every element of array with a value
        Arrays.fill(fruits, "pineapple");

        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }
}
