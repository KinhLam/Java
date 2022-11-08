package C45_B46;

public class B46 {
    public static void main(String[] args) {
        Mang m = new Mang();
        m.sapxepnho();
        System.out.println("\nSap xep mang tang dan");
        m.xuatMang();

        //Xuất giá trị nhỏ nht
        System.out.println("\nGia tri nho nhat: "+m.gtNho());

        //Gọi hàm sắp xếp lớn
        m.sapxeplon();
        System.out.println("\nSap xem mang giam dan: ");
        m.xuatMang();
    }
}
