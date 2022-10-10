package C6_Java_B1;

public class PriorityThread extends Thread{
    public PriorityThread(String name, int priority){
        setName(name);
        setPriority(priority);
        start();
    }

    public void run(){
        System.out.println("Name="+getName()+" - Priority ="+getPriority());
    }

    public static void main(String[] args) throws InterruptedException {
        PriorityThread p1 = new PriorityThread("Thread 113", Thread.MIN_PRIORITY);
        PriorityThread p2 = new PriorityThread("Thread 114", Thread.NORM_PRIORITY);
        PriorityThread p3 = new PriorityThread("Thread 115", Thread.MAX_PRIORITY);
        p1.join();
        p2.join();
        p3.join();
    }
}
