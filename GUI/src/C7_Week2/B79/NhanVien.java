/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week2.B79;

/**
 *
 * @author Akalis
 */
public class NhanVien {
    private String maNV;
    private String phanXuong;
    private int soSp;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getPhanXuong() {
        return phanXuong;
    }

    public void setPhanXuong(String phanXuong) {
        this.phanXuong = phanXuong;
    }

    public int getSoSp() {
        return soSp;
    }

    public void setSoSp(int soSp) {
        this.soSp = soSp;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", soSp=" + soSp + '}';
    }
    
}
