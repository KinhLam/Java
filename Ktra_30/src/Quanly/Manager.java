/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quanly;

import ThongTin.DanhSach;
import ThongTin.MayTinh;
import ThongTin.PhongThucHanh;

import Danhsach.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author LHUser
 */
public class Manager {

    private static Manager instance;
    public static Manager gI(){
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }
    
    private List<MayTinh> mayTinhs;
    private List<PhongThucHanh> phongThucHanhs;
    
    private List<DanhSach> danhSachs;

    public Manager(){
        this.mayTinhs = Data.initMayTinh();
        this.phongThucHanhs = Data.initPhongThucHanh();
        this.danhSachs = new ArrayList<>();
    }
    
    public void PrintMayTinh(){
        //May Tinh
        System.out.println("==========Danh sach May Tinh============");
        System.out.println("soHieu\t TenMay\tXuatXu\tNamNhap\tCauHinh");
        for (MayTinh mayTinh : mayTinhs) {
            System.out.println(mayTinh);
        }
        
        //Phong thuc hanh
        System.out.println("==========Danh sach Phong thuc hanh===========");
        System.out.println("maPhong\tTenPhong\tSoMay");
        
        for (PhongThucHanh phongThucHanh : phongThucHanhs) {
            System.out.println(phongThucHanh);
        }
    }
    
    public void addMayTinh(){
        MayTinh mayTinh = MayTinh.inputMayTinh();
        if (mayTinh != null) {
            mayTinhs.add(mayTinh);
        }
    }
    
       public void AddPhongTH(){
        PhongThucHanh phongThucHanh = PhongThucHanh.InputPhongTH();
        if(phongThucHanh != null){
            phongThucHanhs.add(phongThucHanh);
        } 
    }
    
    
    
    
    
    public int Menu(){
        System.out.println("========KINHLAM========");
        System.out.println("1. Khởi Tạo");
        System.out.println("2. Add Máy Tính");
        System.out.println("3. Add Phòng Thực Hành");
        System.out.println("4. Quản lý Máy Tính");
        System.out.println("5. Sắp Xếp Danh Sách");
        System.out.println("6. Tìm Kiếm Danh Sách Máy Tính");
        System.out.println("=======================");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    
    public void Runner(){
        int choice = 0;
        do {
            choice = Menu();
            switch (choice) {
                case 1:
                    PrintMayTinh();
                    break;
                case 2:
                    addMayTinh();
                    break;
                case 3:
                    AddPhongTH();
                    break;
                default:
                    break;
            }
        } while (choice !=0);
    }
    
    
    
    
}
