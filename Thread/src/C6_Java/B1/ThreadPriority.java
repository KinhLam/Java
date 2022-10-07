package C6_Java.B1;

import java.util.Random;

public class ThreadPriority extends  Thread{
    int num;
    public ThreadPriority(int num){
        this.num = num;
    }

    public void run(){
        for (int i = 0; i < num; i++){
            System.out.println("Count = "+i);
        }
        System.out.println(currentThread().getName());
        System.out.println("Priority = "+getPriority());
    }

    public static void main(String[] args) {
        Random rd = new Random();
        for (int i = 0; i<=2;i++){
            ThreadPriority p = new ThreadPriority(rd.nextInt(5)+1);
            p.setPriority(rd.nextInt(10)+1);
            p.setName("ct"+i);
            p.start();
        }
    }
}
