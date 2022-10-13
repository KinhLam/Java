/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThongTin;


import java.util.Scanner;
/*
 *
 * @author LHUser
 */
public class MayTinh {
    private int soHieu;
    private String tenMay;
    private String xuatXu;
    private int namNhap;
    private String cauHinh;

    public MayTinh(int soHieu, String tenMay, String xuatXu, int namNhap, String cauHinh) {
        this.soHieu = soHieu;
        this.tenMay = tenMay;
        this.xuatXu = xuatXu;
        this.namNhap = namNhap;
        this.cauHinh = cauHinh;
    }

    private MayTinh() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getSoHieu() {
        return soHieu;
    }

    public void setSoHieu(int soHieu) {
        this.soHieu = soHieu;
    }

    public String getTenMay() {
        return tenMay;
    }

    public void setTenMay(String tenMay) {
        this.tenMay = tenMay;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public int getNamNhap() {
        return namNhap;
    }

    public void setNamNhap(int namNhap) {
        this.namNhap = namNhap;
    }

    public String getCauHinh() {
        return cauHinh;
    }

    public void setCauHinh(String cauHinh) {
        this.cauHinh = cauHinh;
    }


//    @Override
    public String toString() {
        return  soHieu+ "\t" + tenMay + "\t" + xuatXu + "\t" + namNhap + "\t" + cauHinh ;
    }
    
    public static MayTinh inputMayTinh(){
        Scanner sc = new Scanner(System.in);
        MayTinh mt = new MayTinh();
        System.out.println("Nhap so hieu");
        mt.setSoHieu(sc.nextInt());
        System.out.println("Nhap ten may tinh");
        mt.setTenMay(sc.nextLine());
        sc.nextLine();
        System.out.println("Nhap noi xuat xu:(\t Nhap khau, \t Noi dia, \t Lien doanh)");
        mt.setXuatXu(sc.nextLine());
        System.out.println("Nhap nam:");
        mt.setNamNhap(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap cau hinh:");
        mt.setCauHinh(sc.nextLine());
        
        return mt;
    }
}
