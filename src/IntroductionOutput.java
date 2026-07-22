public class IntroductionOutput {
    public static void main(String[] args) {
        // Java is a high-level, object-oriented, platform-independent programming language developed by Sun Microsystems (now owned by Oracle). It is designed to let developers write code once and run it anywhere using the Java Virtual Machine (JVM)

        // The Java Virtual Machine (JVM) is a virtual machine that executes Java bytecode and enables Java programs to run on different operating systems without modification.
        // JRE = JVM + Java Class Libraries
        // Run Java programs
        // Cannot compile Java source code.

        // The Java Runtime Environment (JRE) is a software package that provides everything needed to run Java applications, including the JVM and the required Java libraries.
        // JDK = JRE + Development Tools
        // javac – Compiles .java files into .class files.
        // java – Runs Java programs.
        // javadoc – Generates documentation.
        // jar – Creates Java archive files.

        //output and jump to next line
        System.out.println("Hello World!");
        //output with newline character
        System.out.print("I like pizza\n");

        /*
        This is a multi-line comment
         */
        // sout:- shortcut to write "System.out.println"

        // Every Java file is typically a class because Java is an object-oriented programming (OOP) language, and almost all code must be written inside a class. A class serves as a blueprint that groups related data (variables) and behavior (methods) together, allowing Java to organize code in a structured and reusable way. Methods such as main(), which is the program's entry point, cannot exist outside a class, so even the simplest Java program requires one. Although a .java file can contain multiple classes, if it contains a public class, the filename must exactly match that class name.
    }
}
