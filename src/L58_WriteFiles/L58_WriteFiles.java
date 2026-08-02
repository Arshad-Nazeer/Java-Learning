package L58_WriteFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class L58_WriteFiles {
    public static void main(String[] args) {
        // How to write a file using Java (4 popular options)

        // FileWriter :- Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter :- Best for structured data, like reports or logs
        // FileOutputStream :- Best for binary files (images, audio files)

        // absolute path
        // String filePath="C:\\Users\\arsha\\Desktop\\test.txt";
        // FileWriter writer = new FileWriter(filePath);

        String textContent = """
                Roses are Red
                Violets are Blue
                BOOTY BOOTY BOOTY
                ROCKIN' EVERYWHERE
                """;
        // multi line strings

        // reading and writing files are dangerous codes
        // try with statement for opening resource
        try(FileWriter writer = new FileWriter("test.txt")){
            // relative path is JavaLearning1/
            writer.write("I like Pizza!\nIt's really good\n");
            writer.write(textContent);
            System.out.println("File has been written");
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
            System.out.println("Could not locate file location");
        } catch(IOException e){ // needs to be imported
            // general exception for input/output operations. It catches many (but not all) I/O-related exceptions because many of them inherit from IOException.
            // occurs if failed to write file
            // used as a safety net, its not specific
            System.out.println(e.getMessage());
            System.out.println("Could not write file");
        }
    }
}
