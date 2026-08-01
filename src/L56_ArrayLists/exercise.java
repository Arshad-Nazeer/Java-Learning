package L56_ArrayLists;
import java.util.ArrayList;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food items you would like to store: ");
        int numOfFood = sc.nextInt();
        sc.nextLine(); // clear input buffer

        for(int i=0; i<numOfFood; i++){
            System.out.print("Enter the food " + (i+1) + ": ");
            String food = sc.nextLine();
            foods.add(food);
            // foods.add(sc.nextLine());
        }

        for(String food : foods){
            System.out.println(food);
        }

        sc.close();
    }
}
