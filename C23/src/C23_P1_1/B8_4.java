package C23_P1_1;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LHUser
 */
public class B8_4 {
    public static void main(String[] args) {
        int num,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n");
        num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            sum +=i;
        }
        System.out.println("Tong cac so tu nhien tu 1 den "+num+" la: "+sum);
        
        
    }
}
