package C6_Java_B6;

public class ReadThread extends Thread{
    private Prime prime;
    private int sum = 0;

    public ReadThread(Prime prime){
        this.prime = prime;
    }

    @Override
    public void run(){
        while (prime.getPrime()<1000000){
            prime.showSum(sum);
            sum+=prime.getPrime();
        }
    }
}
