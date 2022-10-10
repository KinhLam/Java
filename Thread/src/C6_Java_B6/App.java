package C6_Java_B6;

public class App {
    public static void main(String[] args) {
        Prime prime = new Prime(false,500);

        Thread th1 = new Thread(new FindThread(prime));
        Thread th2 = new Thread(new FindThread(prime));

        th1.start();
        th2.start();
    }
}
