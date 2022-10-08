package C6_Java.B3;

import javax.swing.*;
import java.util.Random;

public class Progressbar implements Runnable{
    JProgressBar progressBar;
    Random rd;

    public Progressbar(JProgressBar progressBar) {
        this.progressBar = progressBar;
        rd = new Random();
    }

    public void run(){
        int minimum = progressBar.getMinimum();
        int maximum = progressBar.getMaximum();

        for (int i = minimum; i <maximum; i++){
            try{
                int value = progressBar.getValue();
                progressBar.setValue(value + rd.nextInt(5)+1);
                Thread.sleep(rd.nextInt(500)+1);
            }catch (InterruptedException interruptedException){}

        }
    }
}
