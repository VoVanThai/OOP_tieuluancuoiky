import java.util.Scanner;

public abstract class HangHoa {
    private String maHang;
    private String loaiHang;
    private String tenHang;
    private double donGia;
    private int soLuongTonKho;
    Scanner sc = new Scanner(System.in);

    public HangHoa() {
        this.maHang = "";
        this.loaiHang = "";
        this.tenHang = "";
        this.donGia = 0;

    }

    public HangHoa(String maHang, String loaiHang, String tenHang, double donGia, int soLuongTonKho) {
        this.maHang = maHang;
        this.loaiHang = loaiHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.soLuongTonKho = soLuongTonKho;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getLoaiHang() {
        return loaiHang;
    }

    public void setLoaiHang(String loaiHang) {
        this.loaiHang = loaiHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void nhap() {
        System.out.println("Nhap ma hang: ");
        maHang = sc.nextLine();
        System.out.println("Nhap loai hang: ");
        loaiHang = sc.nextLine();
        System.out.println("Nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.println("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.println("Nhap so luong ton kho: ");
        soLuongTonKho = sc.nextInt();
    }

    @Override
    public String toString() {
        String str = String.format("%-20s%-20s%-20s%-20f%-20d", maHang, loaiHang, tenHang, donGia, soLuongTonKho);
        return str;
    }
}
