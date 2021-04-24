import java.io.File;
import java.nio.file.Paths;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        if (args.length != 1){
            System.out.println("One arg expected");
            System.exit(1);
        }
        int total = 0;
        try {
            Scanner scan = new Scanner(new File(args[0]));

            while (scan.hasNextLine()){
                String line = scan.nextLine();
                String numberOnly = line.replaceAll("[^0-9]", "");
                total += Integer.valueOf(numberOnly);
                System.out.println(numberOnly);
            }
        } catch (Exception e ){
            e.printStackTrace();
        }
        System.out.println(total + " is total");
    }
}
