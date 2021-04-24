import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        if (args.length != 1){
            System.out.println("One arg expected");
            System.exit(1);
        }
        Scanner scan = new Scanner(args[0]);
        try {
            while (scan.hasNextLine()){
                String line = scan.nextLine();
                StringBuffer str = new StringBuffer();
                for(char c : line.toCharArray()){
                    if (Character.isDigit(c)){
                        str.append(c);
                    } else {
                        System.out.println(str.toString());
                        str.delete(0,str.length());
                    }
                }
            }
        } catch (Exception e ){
            e.printStackTrace();
        }
    }
}
