package KiemTraCuoiKy_CauTrucDuLieuVaGiaiThuat;

public class ThucPham 
{
    String ten_ThucPhamTK;
    int maID_ThucPhamKT = 333666;
    double giaTien_ThucPhamKT;
    int soLuongTonKho_ThucPhamKT;

    ThucPham()
    {

    }
    

    ThucPham(String ten, double gia, int sl)
    {
        ten_ThucPhamTK = ten;
        giaTien_ThucPhamKT = gia;
        soLuongTonKho_ThucPhamKT = sl;
    }


    void inThongTinThucPhamKT()
    {
        System.out.println("Ten ThucPham: " + ten_ThucPhamTK + ", " + "Ma ID ThucPham: " + maID_ThucPhamKT + ", " + "Gia Tien ThucPham: " + giaTien_ThucPhamKT
        + ", " + "So Luong Ton Kho Thuc Pham: " + soLuongTonKho_ThucPhamKT);
    }

    void tongGiaTriHangHoaThucPhamKT()
    {
        
       double tong = giaTien_ThucPhamKT + giaTien_ThucPhamKT;
        
    }
}
