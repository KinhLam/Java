/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C23_P1_1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Akalis
 */
public class B29 {

    public static void main(String[] args) {
        int score = 5;	// điểm khởi tạo = 5
        int soCuaMay, soNguoiChoiDoan;
        String ketQua = "";
        Scanner scanner = new Scanner(System.in);

        // Nếu bạn để điều kiện lặp là true 
        // thì vòng lặp while sẽ chạy đến khi 
        // biểu thức if có từ khóa break được thực thi
        while (true) {
            Random rd = new Random();
            // số máy ra được random từ 1 đến 5
            soCuaMay = 1 + rd.nextInt(5);

            System.out.print("Mời bạn đoán số: ");
            soNguoiChoiDoan = scanner.nextInt();

            if (soNguoiChoiDoan != soCuaMay) {
                ketQua = "==> Bạn đoán sai!";
                System.out.println(ketQua);
                score--;
            } else {
                ketQua = "==> Bạn đoán đúng!";
                System.out.println(ketQua);
                score++;
            }

            if (score == 0) {
                System.out.println("Game Over!");
                break;
            }

            if (score == 10) {
                System.out.println("Congratulations! You Win!");
                break;
            }
        }
    }
}
