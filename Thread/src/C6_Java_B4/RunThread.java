package C6_Java_B4;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RunThread extends Thread{
    ArrayList<BankAccount> list;
    private boolean flag = false;
    
    public RunThread(ArrayList<BankAccount> list){
        this.list = list;
    }
    
    public void stopThread(){
        this.flag = true;
        System.out.println("Send Stopped");
    }
    @Override
    public void run(){
        while(flag = false){
            try {
                //From là tài khoản chuyển
                //Random tài khoản chuyển tiền
                int from = ThreadLocalRandom.current().nextInt(0,list.size());
                int to = from;
                while(from == to){
                    to = ThreadLocalRandom.current().nextInt(0,list.size());
                }
                Thread th = new TransferThread(list.get(from), list.get(to),ThreadLocalRandom.current().nextLong(100000));
                
                //Chạy luồng
                th.start();
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(RunThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
