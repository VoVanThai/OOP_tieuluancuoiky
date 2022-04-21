import java.util.Scanner;

public class HangHoaListTestDrive {
    public static void main(String[] args) {
        HangHoaList hhl = new HangHoaList();
        int luaChon;
        Scanner sc = new Scanner(System.in); 
        
        
        do {
            System.out.println("\n\t-------------------------------- MENU --------------------------------");
            System.out.println("\t1. Them hang hoa.");
            System.out.println("\t2. Xoa hang hoa.");
            System.out.println("\t3. Tim hang hoa theo ma.");
            System.out.println("\t4. Sap xep tang dan theo ma.");
            System.out.println("\t5. Sap xep giam dan theo ma.");
            System.out.println("\t6. In danh sach hang hoa.");
            System.out.println("\t7. Thong ke kho hang.");
            System.out.println("\t0. Thoat.");
            System.out.println("\t------------------------------------------------------------------------");
            System.out.print("\n- Vui long nhap lua chon: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch(luaChon) {
                case 1: 
                    hhl.them();
                    break;
                case 2: 
                    hhl.xoa();
                    break;
                case 3: 
                    hhl.timKiem();
                    break;
                case 4: 
                    hhl.sapXepTangDanTheoMa();
                    break;
                case 5: 
                    hhl.sapXepGiamDanTheoMa();
                    break;
                case 6: 
                    hhl.in();
                    break;
                case 7: 
                    hhl.thongKe();
                    break;
                
            } while (luaChon != 0);
            break;
        } 

        //Du lieu moi
         hhl.them(001, "Thuc pham", "Banh bong lan", 20000, 100);
         hhl.them(002, "Thuc pham", "Banh quy", 15000, 200);       
         hhl.them(003, "Thuc pham", "Keo ngam", 7000, 500);       
         hhl.them(004, "Dien may", "Bep dien tu", 500000, 100);
         hhl.them(005, "Dien may", "Noi com dien", 300000, 150);
         hhl.them(006, "Dien may", "Quat may", 150000, 200);
         hhl.them(007, "Dien may", "Dieu Hoa", 900000, 50);
         hhl.them(008, "Sanh Su", "Chen", 20000, 200);
         hhl.them(009, "Sanh Su", "Dia", 30000, 150);
         hhl.them(010, "Sanh Su", "Am tra", 75000, 100);
    }
}
