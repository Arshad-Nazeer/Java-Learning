public class L12_NestedConditionalStatements {
    public static void main(String[] args) {
        boolean isStudent=true;
        boolean isSenior=false;
        double price=9.99;

        if(isStudent){
            if(isSenior=true){
                System.out.println("You get a Senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price*=0.7;
            }else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        }else{
            if(isSenior=true){
                System.out.println("You get a Senior discount of 20%");
                price*=0.8;
            }else{
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        }

        System.out.printf("The price of a ticket is: $%.2f", price);
    }
}
