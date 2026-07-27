public class L28_VariableScope {
    static int x=3; // Class scope

    public static void main(String[] args) {
        // variable scope
        // where a variable can be accessed

        // variable with local scope are declared inside a method or a block
        // variables in different methods are abstracted from each other


        int x=1;  // local to main method
        System.out.println(x);

        doSomething();
        doSomethingAgain();
    }

    static void doSomething(){
        int x=2; // local to doSomething method
        System.out.println(x);
    }

    // java looks for local variables first before moving for class variables

    static void doSomethingAgain(){
        System.out.println(x);
    }
}
