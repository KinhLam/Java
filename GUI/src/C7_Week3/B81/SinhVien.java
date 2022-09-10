/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week3.B81;

/**
 *
 * @author Akalis
 */
public class SinhVien {

    private String ma;
    private String ten;
    private String lop;
    private double diem1;
    private double diem2;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public double tb() {
        return (diem1 + diem2) / 2;
    }

    public String kq() {
        if (((diem1 + diem2) / 2) >= 5) {
            return "Đậu";
        } else {
            return "Rớt";
        }
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ma=" + ma + '}';
    }
    
}
