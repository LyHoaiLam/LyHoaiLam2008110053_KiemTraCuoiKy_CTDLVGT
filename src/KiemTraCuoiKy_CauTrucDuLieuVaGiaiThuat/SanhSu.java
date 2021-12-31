package KiemTraCuoiKy_CauTrucDuLieuVaGiaiThuat;

public class SanhSu 
{
    String ten_SanhSu;
    int maID_SanhSu = 222444;
    double giaTien_SanhSu;
    int soLuongTonKho_SanhSu;


    public SanhSu()
    {

    }

    public SanhSu(String n, double g, int sl)
    {
        ten_SanhSu = n;
        giaTien_SanhSu = g;
        soLuongTonKho_SanhSu = sl;
    }


    void inThongTinSanhSuKT()
    {
        System.out.println("Ten SanhSu:          " + ten_SanhSu + ", " + "Ma ID SanhSu:            " + maID_SanhSu + ", "
         + "Gia Tien SanhSu:            " + giaTien_SanhSu + "VND, " + "So Luong Ton Kho SanhSu:               " + soLuongTonKho_SanhSu);
    }       
}
