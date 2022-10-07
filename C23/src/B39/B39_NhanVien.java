package B39;

import java.util.Scanner;

public class B39_NhanVien {
    private int maNV;
    private String hoTen, diaChi;
    private boolean CBQL;

    public B39_NhanVien() {
    }

    public B39_NhanVien(int maNV, String hoTen, String diaChi, boolean CBQL) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.CBQL = CBQL;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean getCBQL() {
        return CBQL;
    }

    public void setCBQL(boolean CBQL) {
        this.CBQL = CBQL;
    }


    @Override
    public String toString() {
        return "B39_NhanVien{" +
                "maNV=" + maNV +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", CBQL=" + CBQL +
                '}';
    }

    public void inNV() {

    }

//    public void chucVu(){
//        if (isCBQL() == true){
//            System.out.println("Chuc vu: Can bo quan ly");
//        }else {
//            System.out.println("Chuc vu: Nhan vien");
//        }
//    }
    public static void nhapThongTin(){
        B39_NhanVien nv1 = new B39_NhanVien();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên 1: ");
        nv1.setMaNV(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập tên nhân viên 1: ");
        nv1.setHoTen(sc.nextLine());
        System.out.println("Nhập địa chỉ: ");
        nv1.setDiaChi(sc.nextLine());
        System.out.println("Chức vụ: 1.Cán bộ quản lý  \n 2.Nhân viên");
        nv1.setCBQL(sc.nextBoolean());

    }

    public static void main(String[] args) {



        System.out.printf("%6s %10s %20s %10s  \n", "Mã sinh viên", "Họ tên", "Đia chỉ", "Chức vụ");
        nhapThongTin();
    }

}
