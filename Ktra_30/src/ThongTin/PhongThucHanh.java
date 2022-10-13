package ThongTin;

import java.util.Scanner;

public class PhongThucHanh {
    private int maPhong;
    private String tenPhong;
    private int soMay;

    public PhongThucHanh(int maPhong, String tenPhong, int soMay) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.soMay = soMay;
    }

    public PhongThucHanh() {
    }
    
    

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public int getSoMay() {
        return soMay;
    }

    public void setSoMay(int soMay) {
        this.soMay = soMay;
    }

    @Override
    public String toString() {
        return  maPhong+ " \t " + tenPhong+ " \t\t " + soMay ;

    }
    
       public static PhongThucHanh InputPhongTH(){
        Scanner sc = new Scanner(System.in);
        PhongThucHanh pth = new PhongThucHanh();
        System.out.println("nhap ma phong :");
        pth.setMaPhong(sc.nextInt());sc.nextLine();
        System.out.println("nhap ten phong :");
        pth.setTenPhong(sc.nextLine());
        System.out.println("nhap so may :");
        pth.setSoMay(sc.nextInt());
        return pth;
    }
                
    
}
