package L55_WrapperClasses;

public class L55_WrapperClasses {
    public static void main(String[] args) {
        // Wrapper Classes
        // are objects that wrap primitive values, allowing them to be used where Java expects objects.
        // Allow primitive values (int, char, double, boolean) to be used as objects.
        // "Wrap them in an object"
        // Generally, don't wrap primitives unless you need an object
        // Allows use of Collections Framework and static utility methods

        // depreciated way of wrapping primtives in objects
        Integer a=new Integer(1);
        Double b=new Double(3.14);
        Character c=new Character('$');
        Boolean d=new Boolean(true);

        // modern way - Autoboxing
        // all are references data types and object
        Integer p=123;
        Double q=3.14;
        Character r='$';
        Boolean s=true;
        String e="Pizza";
        System.out.println(p+" "+q+" "+r+" "+s+" "+e);

        // Unboxing - unwrap an object back to its primitive
        int x=p;
        double y=q;
        char z=r;
        boolean w=s;

        // Static Utility method of wrapped classes
        // primitive to string
        String m = Integer.toString(123);
        String n = Double.toString(3.14);
        String o = Character.toString('$');
        String l = Boolean.toString(false);

        System.out.println(m+n+o+l);

        // string to primitive
        int a1 = Integer.parseInt("123");
        double b1 = Double.parseDouble("3.14");
        char c1 = "Pizza".charAt(0); //doesn't has parse method/ unrelated to wrapper classes
        boolean d1 = Boolean.parseBoolean("true");

        System.out.println(a1+" "+b1+" "+c1+" "+d1);

        // more miscellaneous utility method in wrapper classes
        char letter = 'b';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
        letter = '$';
        System.out.println(Character.isLetter(letter));
    }
}
