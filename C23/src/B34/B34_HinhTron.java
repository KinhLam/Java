package B34;

import java.util.Scanner;

public class B34_HinhTron {
    public static double tinhDienTich(double r){
        return r * r * 3.14;
    }

    public static double tinhChuVi(double r){
        return r * 2 * 3.14;
    }

    public static void main(String[] args) {
        double r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn: ");
        r = scanner.nextDouble();
        System.out.println("Diện tích hình tròn là: " +tinhDienTich(r));
        System.out.println("Chu vi hình tròn là: "+ tinhChuVi(r));
    }
}
