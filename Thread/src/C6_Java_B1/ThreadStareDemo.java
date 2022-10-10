/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C6_Java_B1;

/**
 *
 * @author Akalis
 */
public class ThreadStareDemo extends Thread{
    static Thread th;

    public static void main(String[] args) {
        th = new ThreadStareDemo();
        System.out.println("Thread th is born");
        System.out.println("Thread th is ready");
        th.start();
    }
    public void run(){
        System.out.println("Thread th is running");
    }
}
