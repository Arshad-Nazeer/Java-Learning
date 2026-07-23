import java.util.Random;
// The Random class in the java.util package is used to generate pseudorandom values such as integers, doubles, floats, longs, and booleans. These values are produced by a deterministic algorithm, so they are not truly random but appear random for most programming purposes.

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand=new Random();

        int number;
        //rand.nextInt() returns a random 32-bit signed integer

        number=rand.nextInt(); //Integer.MIN_VALUE -2147483648 to Integer.MAX_VALUE 2147483647
        System.out.println(number);

        number=rand.nextInt(1, 6); // bound: [n, m)
        System.out.println(number);

        number=rand.nextInt(50, 100);
        System.out.println(number);

        double num;
        num=rand.nextDouble();  // generate random double [0, 1)
        System.out.println(num);

        boolean isHeads=rand.nextBoolean();
        if(isHeads)
            System.out.println("HEADS");
        else
            System.out.println("TAILS");
    }
}
