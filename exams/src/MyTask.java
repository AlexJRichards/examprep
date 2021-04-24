public class MyTask implements Runnable{

    @Override
    public void run() {
//        . Assuming MyTask is a class that implements the Runnable interface (but
//        not a subclass of Thread), create an instance of this class using the default
//        constructor and start running the code in a separate thread with the highest
//        priority.
        System.out.println("MyTask running");
    }
}
