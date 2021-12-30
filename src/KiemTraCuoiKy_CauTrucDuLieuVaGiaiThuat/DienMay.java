package KiemTraCuoiKy_CauTrucDuLieuVaGiaiThuat;

public class DienMay 
{
    String ten_DienMay;
    int maID_DienMay = 444888;
    double giaTien_DienMay;
    int soLuongTonKho_DienMay;


    public DienMay()
    {

    }

    public DienMay(String n, double g, int sl)
    {
        ten_DienMay = n;
        giaTien_DienMay = g;
        soLuongTonKho_DienMay = sl;
    }


    void inThongTinDienMay()
    {
        System.out.println("Ten DienMay: " + ten_DienMay + ", " + "Ma ID DienMay: " + maID_DienMay + ", "
         + "Gia Tien DienMay: " + giaTien_DienMay + ", " + "So Luong Ton Kho SanhSu: " + soLuongTonKho_DienMay);
    }           
}
