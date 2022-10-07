/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C23_P1_1;

import java.util.Scanner;

/**
 *
 * @author Akalis
 */
public class B8_8 {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mang cac so nguyen:");
        n = scanner.nextInt();
        

        if (n ==0) {
            System.out.println("Day la so khong!");
        } else if (n % 2 ==0) {
            System.out.println("Day la so le!");
        }else{

            System.out.println("Day la so le!");
        }
    }
}
