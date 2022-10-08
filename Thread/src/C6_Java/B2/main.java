package C6_Java.B2;

import java.util.Random;

import static java.lang.Thread.sleep;

public class main {
    public static void main(String[] args) {
        final int MAX = 100;
        Random rand = new Random();
        ProgressBar p = new ProgressBar();
//        for (int i = 1; i<= MAX; i++){
//            p.setValue(i);
//            sleep(rand.nextInt(50));
//        }
        p.reportSuccess();
        p = new ProgressBar();
        p.setMaxRange(MAX);
        try{
            for ( int i = 1; i <=MAX; i++){
                p.setValue(i);
                sleep(50 +rand.nextInt(50));
                if (i >=90){
                    throw new RuntimeException("Error while process");
                }
            }
            p.reportSuccess();
        }catch (Exception e){
            p.reportError();
        }
    }
}
