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
public class B8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhập vào số n: ");
        n = scanner.nextInt();
        System.out.println("Các số lẻ từ 1 đến "+n+" là: ");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
