package B38;

import java.util.Scanner;

public class B38_SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT, diemTH;

    public B38_SinhVien() {
    }

    public B38_SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float tinhDiemTB() {
        return (diemTH + diemLT) / 2;
    }

    //sử dụng phương thức toString để hiển thị kết quả
    public String toString() {
        return maSV + " - " + hoTen + " diem Tb : " + tinhDiemTB();
    }

    //hoặc có thể tạo một phương thức khác dùng để hiển thị kết quả
    public void inSV() {
        System.out.printf("%6d %-18s %10.2f %12.2f %12.2f \n", maSV, hoTen, diemTH, diemLT, tinhDiemTB());
    }

    public static void main(String[] args) {
        //khởi tạo và nhập giá trị cho các thuộc tính thuôc lớp SinhVien
        //theo đề bài yêu cầu chúng ta sẽ thực hiện việc tạo 3 sinh viên,
        // vì vậy chúng ta sẽ đi tạo từng sinh viên

        //-------------------sinh viên 1-------------------

        B38_SinhVien sv1 = new B38_SinhVien();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên 1: ");
        sv1.setMaSV(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập tên sinh viên 1: ");
        sv1.setHoTen(sc.nextLine());
        System.out.println("Nhập điểm lý thuyết: ");
        sv1.setDiemLT(sc.nextFloat());
        System.out.println("Nhập điểm thực hành: ");
        sv1.setDiemTH(sc.nextFloat());

        //-------------------sinh viên 2----------------------

        B38_SinhVien sv2 = new B38_SinhVien();
        System.out.println("Nhập mã sinh viên 2: ");
        sv2.setMaSV(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập tên sinh viên 2: ");
        sv2.setHoTen(sc.nextLine());
        System.out.println("Nhập điểm lý thuyết: ");
        sv2.setDiemLT(sc.nextFloat());
        System.out.println("Nhập điểm thực hành: ");
        sv2.setDiemTH(sc.nextFloat());

        //---------------------sinh viên 3------------------------

        B38_SinhVien sv3 = new B38_SinhVien();
        System.out.println("Nhập mã sinh viên 3: ");
        sv3.setMaSV(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập tên sinh viên 3: ");
        sv3.setHoTen(sc.nextLine());
        System.out.println("Nhập điểm lý thuyết: ");
        sv3.setDiemLT(sc.nextFloat());
        System.out.println("Nhập điểm thực hành: ");
        sv3.setDiemTH(sc.nextFloat());
        System.out.printf("%6s %10s %20s %10s %10s \n", "Mã sinh viên", "Họ tên", "Điểm lý thuyết", "Điểm thực hành", "Điểm trung bình");
        //gọi phương thức in đã được viết ở class SinhVien cho các sinh viên để hiển thị kết quả đã nhập
        sv1.inSV();
        sv2.inSV();
        sv3.inSV();
    }
}
