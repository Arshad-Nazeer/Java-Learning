package L43_Static;

public class Friend {
    String name;
    int num=0;
    static int numOfFriends=0;


    Friend(String name){
        this.name=name;
        numOfFriends++;
        num++;
    }

    static void showFriends(){
        System.out.println("You have "+numOfFriends+" friends");
        // static attribute does not require this keyword
    }
}
