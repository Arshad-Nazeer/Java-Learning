package L59_ReadFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class L59_ReadFiles {
    public static void main(String[] args) {
        // How to read a file using java (3 popular options)

        // BufferedReader + FileReader :- Best for reading text files line by line
        // FileInputStream :- Best for binary files (images, audio files)
        // RandomAccessFile :- Best for read/write specific portions of a large file

        // FileReader :- Opens a text file and reads its contents character by character. It provides the basic mechanism for reading text directly from a file but does not support reading entire lines.
        // BufferedReader → Wraps a Reader (such as FileReader) and stores data in a buffer(memory) for faster reading. It provides convenient methods like readLine(), making it efficient to read text one line at a time.

         String filePath = "C:\\Users\\arsha\\Desktop\\Arshad Nazeer\\javafile.txt";

         try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
             System.out.println("That File Exists");
             String line; // to read line by line
             while((line=reader.readLine())!=null){
                 System.out.println(line);
             }
             // readLine() reads one complete line of text from the file (up to the newline character) and then point to next line
             // returns it as a String, and returns null when the end of the file is reached.
         }catch(FileNotFoundException e){
             System.out.println(e.getMessage());
             System.out.println("File not found");
         }catch(IOException ex){
             // safety net
             System.out.println("Something went wrong");
         }
    }
}
