/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C6_Java.B1;

/**
 *
 * @author Akalis
 */
public class MyThread2 implements Runnable{
    public static void main(String[] args) {
        MyThread2 myRunndable = new MyThread2();
        Thread th2= new Thread(myRunndable);
        th2.start();
        System.out.println("This is the main thread");
    }
    public void run(){
        while (true){
            try{
                System.out.println("This is the child Thread");
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}
