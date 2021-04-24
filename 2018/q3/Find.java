// Write a Java program Find that reads a text file, containing a list of different actors
// names (one on each line) and prints out all lines in that file, each on a separate line, that
// match a particular keyword provided by the user. Matching should be case insensitive.
// The user should provide TWO command line arguments, the FIRST, which specifies
// the text file name containing the list of actors names and the SECOND, which specifies
// the keyword to be searched. Finally, the number of lines that match the keyword should
// be printed, or if no matches exist, an appropriate message is printed.
// Your program should include appropriate error handling. You can assume all the necessary
// classes from the Java standard library are imported. The followingskel eton
// program is provided.
import java.io.*;
import java.util.Scanner;

public class Find {
    public static void main(String[] args) {

        if (args.length != 2){
            System.out.println("Two arguments expected!");
            System.exit(1);
        }

        try {
            File film = args[0];
            String keyword = args[1].toLowerCase();
            int c= 0;
            Scanner scan = new Scanner(film);
            while (scan.hasNextLine()){
                String line = scan.nextLine().toLowerCase();
                if (line.contains(keyword)){
                    c++;
                }
            }

            if (c==0){
                System.out.println("No words found");
            } else {
                System.out.println(keyword + " was found " + c " times.");
            }
        } catch (Exception e){
            System.out.println("File not found");
        }
    }
}