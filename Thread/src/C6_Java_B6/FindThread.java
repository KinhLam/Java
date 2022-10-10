package C6_Java_B6;

public class FindThread extends Thread{
    private final int start = 1000;
    private final int end = 1000000;
    private Prime prime;

    public FindThread(Prime prime){
        this.prime = prime;
    }

    @Override
    public void run(){
        for (int i = start; i<end;i++){
            if (Prime.isPrime(i)) {
                prime.setPrime(i);
            }
        }
    }
}
