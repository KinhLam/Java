/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C23_P1_1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Akalis
 */
public class B8_7 {
    public static void main(String[] args) {
        int a,b;
        double nghiem;
        DecimalFormat decimalFormat = new DecimalFormat("#,##");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap vao so a: ");
        a = scanner.nextInt();
        System.out.println("Nhap vao so b: ");
        b = scanner.nextInt();
        System.out.println("Phuong trinh ban vua nhap la: " + a + "x + " + b + " = 0.");
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh nay co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            nghiem = (double) -b / a;   // ép kiểu để cho ra kết quả chính xác
            System.out.println("Phuong trinh co nghiem x = " + decimalFormat.format(nghiem) + ".");
        }
    }
}
