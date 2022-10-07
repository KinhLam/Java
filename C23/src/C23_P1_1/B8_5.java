/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C23_P1_1;

import java.util.Scanner;

/**
 *
 * @author LHUser
 */
public class B8_5 {

    public static void main(String[] args) {
        int num, sum1 = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n:");
        num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 1) {
                sum += i;

            } else {
                sum1 += i;
            }
        }
        if (num % 2 == 0) {

            System.out.println("Tong cac so chan tu nhien tu 0 den " + num + " la: " + sum1);
        }
        else{
            
        System.out.println("Tong cac so le tu nhien tu 1 den " + num + " la: " + sum);
        }

    }

}
