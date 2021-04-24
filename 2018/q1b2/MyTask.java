public class MyTask extends Thread{
    private int taskId;
    public MyTask(Integer taskID){
        this.taskId = taskID;
        this.setPriority(MAX_PRIORITY);

    }

    public void run(){
        System.out.println(this.taskId + "is running.");
    }
}