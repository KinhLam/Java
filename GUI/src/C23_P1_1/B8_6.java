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
public class B8_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so luong phan tu: n = ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Nhap vao mang cac so nguyen:");
        for (int i = 0; i < n; i++) {
            System.out.print("\tPhan tu thu " + (i + 1) + " la: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Mang vua nhap la:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }

        int min = a[0];
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            } 
            else if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("\nPhan tu lon nhat cua mang la:" + max);
        System.out.println("\nPhan tu nho nhat cua mang la:" + min);

        sc.close();
    }

}
