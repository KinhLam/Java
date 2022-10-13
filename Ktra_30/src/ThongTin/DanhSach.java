package ThongTin;

public class DanhSach {
    private MayTinh mayTinh;
    private DanhSach danhSach;

    public DanhSach(MayTinh mayTinh) {
        this.mayTinh = mayTinh;
        danhSach = new DanhSach(mayTinh);
    }

    
}
