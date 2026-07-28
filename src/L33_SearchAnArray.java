import java.util.Scanner;

public class L33_SearchAnArray {
    public static void main(String[] args) {
        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        int target=2;
        boolean flag=false;

        for(int i=0; i<numbers.length; i++){
            if(target==numbers[i]) {
                System.out.println("Element found at index: "+i);
                flag=true;
                break;
            }
        }

        if(!flag) System.out.println("Element not found");

        // searching in strings array
        Scanner sc = new Scanner(System.in);

        String[] fruits = {"apple", "orange", "banana"};
        System.out.print("Enter fruit to search for: ");
        String target2=sc.nextLine();
        flag=false;

        for(int i=0; i<fruits.length; i++){
            // since strings are reference data types
            // target2==fruits[i] will compare memory adresses
            // checks if they are at the same location
            if(target2.equals(fruits[i])) { // comparing content
                System.out.println("Element found at index: "+i);
                flag=true;
                break;
            }
        }

        if(!flag) System.out.println("Element not found");
    }
}
