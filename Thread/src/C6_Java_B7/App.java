package C6_Java_B7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Init init = new Init();
        Scanner sc = new Scanner(System.in);
        System.out.println("Select (1. Multi thread; 2. Single thread)");
        int choose = sc.nextInt();
        switch (choose){
            case 1:
                System.out.println("Mang truoc khi sap xep");
                Thread th1 = new Thread(new MyThread(0,init.arr.length/2,init.arr));

                th1.start();
                Thread th2 = new Thread(new MyThread(init.arr.length/2+1,init.arr.length,init.arr));
                th2.start();
                break;
            case 2:
                Thread mainThread = new Thread(new MyThread(0,init.arr.length,init.arr));
                mainThread.start();
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
