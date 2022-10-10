/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C6_Java_B1;

/**
 *
 * @author Akalis
 */
public class ThreadTest implements Runnable{
    Thread objTh;
    public ThreadTest(){
        System.out.println(Thread.currentThread().getName());
        objTh = new Thread(this);
        System.out.println("Thread objTh is Alive ="+objTh.isAlive());
        objTh.setName("New Thread");
        objTh.start();
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.activeCount());
        System.out.println("Thread objTh isAlive ="+objTh.isAlive());
    }

    public static void main(String[] args) {
        new ThreadTest();
    }
}
