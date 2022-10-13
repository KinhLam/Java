/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Danhsach;

import ThongTin.MayTinh;
import ThongTin.PhongThucHanh;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LHUser
 */
public class Data {
    public static List<MayTinh> initMayTinh(){
        var list = new ArrayList<MayTinh>();
        list.add(new MayTinh(1, "Asus", "NhapKhau", 2020, "Tot"));
        list.add(new MayTinh(2, "Acer", "NhapKhau", 2020, "Tot"));
        list.add(new MayTinh(3, "Lenovo", "NhapKhau", 2020, "Tot"));
        list.add(new MayTinh(4, "Dell", "NoiDia", 2020, "Hong"));
        list.add(new MayTinh(5, "Mac", "LienDoanh", 2020, "Tot"));
        return list;
    }
    
    public static List<PhongThucHanh> initPhongThucHanh(){
        var list = new ArrayList<PhongThucHanh>();
        list.add(new PhongThucHanh(1, "PC1", 5));
        list.add(new PhongThucHanh(2, "PC2", 10));
        return list;
    }
}
