package KiemTraCuoiKy_CauTrucDuLieuVaGiaiThuat;

import java.util.Scanner;

public class ThucPham 
{
    String ten_ThucPham;
    int maID_ThucPham = 333666;
    double giaTien_ThucPham;
    int soLuongTonKho_ThucPham;
    Scanner nhapThucPham = new Scanner(System.in);

    
    ThucPham()
    {

    }
    

    ThucPham(String ten, double gia, int sl)
    {
        ten_ThucPham = ten;
        giaTien_ThucPham = gia;
        soLuongTonKho_ThucPham = sl;
    }


    void inThongTinThucPham()
    {
        System.out.println("Ten ThucPham: " + ten_ThucPham + ", " + "Ma ID ThucPham: " + maID_ThucPham + ", " + "Gia Tien ThucPham: " + giaTien_ThucPham
        + ", " + "So Luong Ton Kho Thuc Pham: " + soLuongTonKho_ThucPham);
    }

    
}
