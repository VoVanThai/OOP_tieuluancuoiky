public class HangDienMay extends HangHoa {
    private int thoiGiaBaoHanh, congSuat;

    public HangDienMay(String maHang, String loaiHang, String tenHang, double donGia,
            int soLuongTonKho, int thoiGiaBaoHanh, int congSuat) {
        super(maHang, loaiHang, tenHang, donGia, soLuongTonKho);
        this.thoiGiaBaoHanh = thoiGiaBaoHanh;
        this.congSuat = congSuat;
    }

    public int getThoiGiaBaoHanh() {
        return thoiGiaBaoHanh;
    }

    public void setThoiGiaBaoHanh(int thoiGiaBaoHanh) {
        this.thoiGiaBaoHanh = thoiGiaBaoHanh;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public void nhap() {
        System.out.println("Nhap thoi gia bao hanh: ");
        thoiGiaBaoHanh = sc.nextInt();
        System.out.println("Nhap cong suat: ");
        congSuat = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-20d%-20d%-20d", thoiGiaBaoHanh, congSuat, tinhVAT());
    }

    @Override
    public double tinhVAT() {
        double vat;
        vat = this.getDonGia() * 0.1;
        return vat;
    }
}
