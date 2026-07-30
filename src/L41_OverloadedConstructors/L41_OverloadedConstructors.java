package L41_OverloadedConstructors;

public class L41_OverloadedConstructors {
    public static void main(String[] args) {
        // Overloaded Constructors :-
        // Allow a class to have multiple constructors with different parameter lists
        // enable objects to be initialized in various ways
        // can be used to setup default values if not provided

        User user = new User();
        System.out.println(user.username);
        System.out.println(user.email);
        System.out.println(user.age);

        User user1=new User("Spongebob");
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        User user2 = new User("Patrick", "PStar@aol.com");
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        User user3 = new User("Sandy", "SCheeks@gmail.com", 27);
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);
    }
}
