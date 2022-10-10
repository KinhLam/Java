package C6_Java_B6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Prime {
    private boolean syn = false;
    private int prime;
    private int time;
    private long iniTime;

    public Prime(boolean syn, int time){
        this.syn = syn;
        this.time = time;
        this.iniTime = System.currentTimeMillis();
    }

    public int getPrime(){
        return prime;
    }

    //Hàm ktra số nguyên tố
    public static boolean isPrime(int x){
        if (x<2){
            return false;
        } else if (x==2) {
            return true;
        }
        for (int i = 2; i < Math.sqrt((double) x); ++i){
            if (x%i ==0){
                return false;
            }
        }
        return true;
    }

    //Hàm đồng bộ
    public synchronized void setPrime(int prime){
        while (!syn){
            try {
                //Chờ Hàm showSun notify
                wait();
            }catch (InterruptedException ex){
                Logger.getLogger(Prime.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
        System.out.println("Current prime: "+prime+ " ("+(System.currentTimeMillis()-iniTime)+"ms)");
        this.prime = prime;
        try {
            Thread.sleep(time);
        }catch (InterruptedException ex){
            Logger.getLogger(Prime.class.getName()).log(Level.SEVERE,null,ex);
        }

        //Set flag để thread setPrime tiếp theo vào vị trí chờ
        syn = false;
        //notify cho showSun chay
        notifyAll();
    }
    public synchronized void showSum(long sum){
        while (syn){
            try {
                //Chờ setPrime
                wait();
            }catch (InterruptedException ex){
                Logger.getLogger(Prime.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
        System.out.println(" - Total no: "+(sum+prime)+" ("+(System.currentTimeMillis()-iniTime)+"ms)");
        syn = true;
        notifyAll();
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            Logger.getLogger(Prime.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
