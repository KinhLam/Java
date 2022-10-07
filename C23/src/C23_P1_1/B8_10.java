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
public class B8_10 {
    public static void main(String[] args) {
    String chuoi;
    char kyTu = 'a';
    int count = 0;
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhập vào chuỗi bất kỳ: ");
    chuoi = scanner.nextLine();
         
    // duyệt từ đầu đến cuối chuỗi
    for (int i = 0; i < chuoi.length(); i++) {
        // Nếu ký tự tại vị trí thứ i bằng 'a' thì tăng count lên 1
        if (chuoi.charAt(i) == kyTu) {
            count++;
        }
    }
         
    System.out.println("Số lần xuất hiện của ký tự " + kyTu +
        " trong chuỗi " + chuoi + " = " + count);
}
}
