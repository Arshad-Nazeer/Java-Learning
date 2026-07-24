import java.util.Scanner;

public class L15P_weightConverter {
    public static void main(String[] args) {
        // Weight Conversion Program

        Scanner sc = new Scanner(System.in);

        double weight, newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: convert lbs to KGs");
        System.out.println("2: convert KGs to lbs");

        System.out.print("choose an option: ");
        choice = sc.nextInt();

        if(choice==1){
            System.out.print("Enter weight in lbs: ");
            weight=sc.nextDouble();
            newWeight=weight*0.453592;
            System.out.printf("The new weight in Kgs is: %.2f\n", newWeight);
        }else if(choice==2){
            System.out.print("Enter weight in KGs: ");
            weight=sc.nextDouble();
            newWeight=weight*2.20462;
            System.out.printf("The new weight in lbs is: %.2f\n", newWeight);
        }else System.out.println("Invalid choice");

        sc.close();
    }
}
