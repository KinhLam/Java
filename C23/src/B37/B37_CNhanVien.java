package B37;

public class B37_CNhanVien {
    private String ho,ten;
    private int soSP;
    private double donGia,tienLuong;

    public B37_CNhanVien(String ho, String ten, int soSP) {
        super();
        this.ho = ho;
        this.ten = ten;
        this.soSP = soSP;

        if (this.soSP < 0){
            this.soSP = 0;
        }
    }
    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }

    public double getLuong(int soSP) {
        if (soSP >= 1 && soSP <= 199) {
            donGia = 0.5;
        } else if (soSP >= 200 && soSP <= 399) {
            donGia = 0.55;
        } else if (soSP >= 400 && soSP <= 599) {
            donGia = 0.6;
        } else {
            donGia = 0.65;
        }
        tienLuong = (double) soSP * donGia;
        return tienLuong;
    }

    public static void main(String[] args) {
        B37_CNhanVien nhanVien1 = new B37_CNhanVien("Nguyễn", "Bình", 500);
        B37_CNhanVien nhanVien2 = new B37_CNhanVien("Lê", "Vy", 199);
        System.out.println("Tiền lương của nhân viên 1 = " + nhanVien1.getLuong(nhanVien1.getSoSP()));
        System.out.println("Tiền lương của nhân viên 2 = " + nhanVien2.getLuong(nhanVien2.getSoSP()));
}}
