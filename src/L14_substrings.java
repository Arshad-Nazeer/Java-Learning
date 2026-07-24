import java.util.Scanner;

public class L14_substrings {
    public static void main(String[] args) {

        // .substring() :- a method used to extract a portion of a string
        // .substring(start, end)   [start, end)

        Scanner sc=new Scanner(System.in);

        String email = "Bro123@gmail.com";
        String username = email.substring(0, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@')+1);

        System.out.println("Username: "+username);
        System.out.println("Domain: "+domain);

        System.out.print("Enter your mail: ");
        String email2 = sc.next();

        if(email2.contains("@")) {
            username = email2.substring(0, email.indexOf('@'));
            domain = email2.substring(email.indexOf('@') + 1);

            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);
        }else System.out.println("Invalid email");

        sc.close();
    }
}
