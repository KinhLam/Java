package C23_P1_1;

import javax.swing.*;
import java.util.Scanner;

public class B35_CHinhTamGiac {
    private int ma;
    private int mb;
    private int mc;

    public B35_CHinhTamGiac(){
        ma=mb=mc=0;
    }

    public B35_CHinhTamGiac(int a, int b,int c){
        if (a<0){
            JOptionPane.showMessageDialog(null,"canh phai > 0","Thong bao",JOptionPane.WARNING_MESSAGE);
            ma=0;
            return;
        }
        if (b<0){
            JOptionPane.showMessageDialog(null,"canh phai > 0","Thong bao",JOptionPane.WARNING_MESSAGE);
            mb =0;
            return;
        }
        if (c<0){
            JOptionPane.showMessageDialog(null,"canh phai > 0","Thong bao",JOptionPane.WARNING_MESSAGE);
            mc =0;
            return;
        }
        if (a+b <=c||a+c<=b||b+c<=a){
            JOptionPane.showMessageDialog(null,"Khong phai tam giac","Thong bao",JOptionPane.ERROR_MESSAGE);
            ma=mb=mc=0;
            return;
        }
        ma=a;
        mb=b;
        mc=c;
    }

    //Get methods
    public int getCanhA(){
        return ma;
    }
    public int getCanhB(){
        return mb;
    }
    public int getCanhC(){
        return mc;
    }
    //set methods
    public void setCanhA(int a){
        ma=a;
    }
    public void setCanhB(int b){
        mb=b;
    }
    public void setCanhC(int c){
        mc=c;
    }

    public boolean laTamGiac(){
        return(ma+mb>mc && ma +mc >mb&&mb+mc>ma);
    }

    public boolean laTamGiac(int a,int b,int c){
        return (a+b>c&&a+c>b&&b+c>a);
    }

    public int getChuVi(){
        return ma+mb+mc;
    }

    public double getDienTich(){
        double p = (double)(ma+mb+mc)/2;
        return Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
    }

    public static void main(String[] args) {
        System.out.println("Nhap ba canh hinh tam giac:");
        Scanner scanner = new Scanner(System.in);
        int ma = scanner.nextInt();
        int mb = scanner.nextInt();
        int mc = scanner.nextInt();
        B35_CHinhTamGiac tamgiac = new B35_CHinhTamGiac(ma,mb,mc);
        if (tamgiac.laTamGiac()){
            System.out.println("Chu vi: "+tamgiac.getChuVi());
            System.out.println("Dien tich: "+tamgiac.getDienTich());
        }
    }
}
