package L43_Static;

import static java.lang.Math.*;

public class L43_Static {
    public static void main(String[] args) {
        // Static Keyword :-
        // makes a variable or method belong to the class rather than to any specific object
        // commonly used for utility methods and shared resources
        // main is a static method where program execution starts

        Friend friend1 = new Friend("Spongebob");
        System.out.println(friend1.num);
        System.out.println(Friend.numOfFriends);

        Friend friend2 = new Friend("Patrick");
        System.out.println(friend2.num);
        System.out.println(Friend.numOfFriends);

        Friend friend3 = new Friend("Squidward");
        System.out.println(friend3.num);
        System.out.println(Friend.numOfFriends);

        Friend friend4 = new Friend("Sandy");
        System.out.println(friend4.num);
        System.out.println(Friend.numOfFriends);

        // every object has its own copy of num
        // There is only one copy of numOfFriends which belongs to the class and is shared among all objects

        Friend friend5 = new Friend("Gary");
        System.out.println(friend5.num);
        System.out.println(Friend.numOfFriends);

        Friend.showFriends();

        System.out.println(Math.round(3.99));
        // round method in Math class is a static method/ utility method which does not require object and can be called directly
    }
}
