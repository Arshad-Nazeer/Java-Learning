public class L13_StringMethods {
    public static void main(String[] args) {
        String name="   Arshad   ";

        int length = name.length();
        System.out.println(length);

        char letter = name.charAt(8);
        System.out.println(letter);

        int idx = name.indexOf("z");  // first occurence
        System.out.println(idx);      // returns -1 if not found

        int lastidx = name.lastIndexOf("a");
        System.out.println(lastidx);

        name = name.toUpperCase();
        System.out.println(name);

        name = name.toLowerCase();
        System.out.println(name);

        name = name.trim();
        System.out.println(name);

        name = name.replaceAll("a", "z");
        System.out.println(name);

        if(name.isEmpty())
            System.out.println("Your name is empty");
        else System.out.println(name.isEmpty());

        if(name.contains(" "))
            System.out.println("Your name contains spaces");

        name="Password";

        if(name.equals("password"))
            System.out.println("Your name can't be password");
        else System.out.println("Hello "+name);

        if(name.equalsIgnoreCase("password"))
            System.out.println("Your name can't be password");
        else System.out.println("Hello "+name);

        String str1="name", str2="name";

        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);

        String str3 = new String("name");
        String str4 = new String("name");

        System.out.println(str3.equals(str4));
        System.out.println(str3==str4);
        // == compares the references (memory addresses) of two strings, checking whether both variables point to the same object. .equals() compares the contents of the strings, checking whether they contain the same sequence of characters. For string comparisons, .equals() should generally be used, while == is used only when checking if two references refer to the same object.
    }
}
