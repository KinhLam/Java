package B36;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Akalis
 */
public class B36_NhanVien {
    private String maNV;
    private int soSP;

    public B36_NhanVien(){
        this.maNV ="";
        this.soSP = 0;
    }

    public B36_NhanVien(String maNV,int soSP){
        if (soSP<0){
            soSP = 0;
        }
        this.maNV = maNV;
        this.soSP = soSP;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        if (soSP <0){
            soSP = 0;
        }
        this.soSP = soSP;
    }

    public boolean coVuotChuan(){
        return this.soSP>500;
    }

    public String getTongKet(){
        String temp = "";
        if (this.coVuotChuan()){
            temp = "Vuot";
        }
        return temp;
    }

    public double getLuong(){
        return this.coVuotChuan()? (500*20000+(this.soSP-500)*30000):this.soSP*20000;
    }

    public static void xuatTieuDe(){
        System.out.println("MaNV \t| So San Pham\t| Luong \t| Tong Ket \t|");
    }
    @Override
    public String toString() {
        return this.maNV +"\t|" + this.soSP +"\t|" + this.getLuong()+"\t|"+this.getTongKet()+"\t|";
    }
    @SuppressWarnings("static-access")
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String maso;
        int sosp;
        System.out.println("Nhan vien 1: Nhap Maso va So sp");
        maso=input.nextLine();
        sosp=Integer.parseInt(input.nextLine());
        B36_NhanVien nv1 = new B36_NhanVien(maso,sosp);
        System.out.println("Nhan vien 2: Nhap Maso va So sp");
        maso=in.readLine();
        sosp=Integer.parseInt(in.readLine());
        B36_NhanVien nv2 = new B36_NhanVien(maso, sosp);
        xuatTieuDe();
        System.out.println(nv1.toString());
        System.out.println(nv2.toString());
    }
}
