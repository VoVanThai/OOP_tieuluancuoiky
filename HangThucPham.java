import java.util.Date;

public class HangThucPham extends HangHoa {
    private Date ngaySanXuat, ngayHetHan;
    private String nhaCungCap;

    public HangThucPham(String maHang, String loaiHang, String tenHang, double donGia,
            int soLuongTonKho, Date ngaySanXuat, Date ngayHetHan, String nhaCungCap) {
        super(maHang, loaiHang, tenHang, donGia, soLuongTonKho);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public void nhap() {
        super.nhap();
        System.out.println("Nhap ngay san xuat: ");

    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-20s%-20s%-20s%-20d", ngaySanXuat, ngayHetHan, nhaCungCap, tinhVAT());
    }

    @Override
    public double tinhVAT() {
        double vat;
        vat = this.getDonGia() * 0.05;
        return vat;
    }
}
