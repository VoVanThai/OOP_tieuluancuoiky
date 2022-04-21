import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class HangHoaList {
    private List<HangHoa> hh = new ArrayList<>();

    private int tongSLTKHTP;
    private int tongSLTKHDM;
    private int tongSLTKHSS;
    private double donGiaHTP;
    private double donGiaHDM;
    private double donGiaHSS;

    Scanner sc = new Scanner(System.in);

    public HangHoaList() {

    }

    public void them() {
        HangHoa hangHoa = new HangHoa();
        this.hangHoa.nhap();
    }

    public void xoa() {
        HangHoa hangHoa = new HangHoa();
        int maHangCanXoa;
        System.out.println("Nhap ma hang can xoa:");
        maHangCanXoa = sc.nextInt();
        if (maHangCanXoa == hangHoa.getLoaiHang()) {
            this.hh.remove(hangHoa);
        }
        System.out.println("Da xoa !");
    }

    public void timKiem() {
        HangHoa hangHoa = new HangHoa();
        int maHangCanTim;
        System.out.println("Nhap ma hang can tim: ");
        maHangCanTim = sc.nextInt();
        if (maHangCanTim == hangHoa.getMaHang()) {
            System.out.println(hangHoa);
        } else {
            System.out.println("Khong tim thay ma hang !");
        }

    }

    public void sapXepTangDanTheoMa() {
        Collections.sort(hh, (o1, o2) -> o1.getMaHang().compareTo(o2.getMaHang()));
    }

    public void sapXepGiamDanTheoMa() {
        Collections.sort(hh, (o1, o2) -> o2.getMaHang().compareTo(o1.getMaHang()));
    }

    public void thongKe() {
        for (HangHoa hangHoa : hh) {
            if (hangHoa instanceof HangThucPham) {
                tongSLTKHTP += hangHoa.getSoLuongTonKho();
                donGiaHTP += hangHoa.getDonGia();
            } else if (hangHoa instanceof HangDienMay) {
                tongSLTKHDM += hangHoa.getSoLuongTonKho();
                donGiaHDM += hangHoa.getDonGia();
            } else {
                tongSLTKHSS += hangHoa.getSoLuongTonKho();
                donGiaHSS += hangHoa.getDonGia();
            }
        }

        System.out.println("Tong so luong ton kho hang thuc pham: " + tongSLTKHTP);
        System.out.println("Tong so luong ton kho hang dien may: " + tongSLTKHDM);
        System.out.println("Tong so luong ton kho hang sanh su: " + tongSLTKHSS);
        System.out.println("Tong so luong ton kho hang: " + (tongSLTKHTP + tongSLTKHDM + tongSLTKHSS));
        System.out.println("Tong don gia hang thuc pham: " + donGiaHTP);
        System.out.println("Tong don gia hang dien may: " + donGiaHDM);
        System.out.println("Tong don gia hang sanh su: " + donGiaHSS);
        System.out.println("Tong don gia kho hang : " + (donGiaHTP + donGiaHDM + donGiaHSS));
    }

    public void in() {
        for (HangHoa hangHoa : hh) {
            System.out.println(hangHoa);
        }
    }

}
