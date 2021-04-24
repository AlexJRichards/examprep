import java.util.Random;

public class q1b{
    public static void main(String[] args) {
//        . Given a String str, create a new String with variable name letterOnly
//        that keeps all the letters only and in the order they appear in str. [3]
//        ii. Generate a double array numbers and initialise it with 100 random floating point numbers in the range of 5 to I 0. [3]
//        111. Assuming MyTask is a class that implements the Runnable interface (but
//        not a subclass of Thread), create an instance of this class using the default
//        constructor and start running the code in a separate thread with the highest
//        priority.

        String str = "abcde28";

        StringBuffer lettersOnly = new StringBuffer();
        for (char c : str.toCharArray()){
            if (Character.isLetter(c)){
                lettersOnly.append(c);
            }
        }
        String letterOnly = lettersOnly.toString();
        System.out.println(letterOnly);
        double[] numbers = new double[100];
        Random rand = new Random();
        for (int i = 1;i<100;i++){
            numbers[i] = rand.nextInt(6) + 5;
        }
        for (double i : numbers){
            System.out.println(i);
        }
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask);
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
    }
}