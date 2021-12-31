package KiemTraCuoiKy_CauTrucDuLieuVaGiaiThuat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Date;
import java.util.Collections;

public class KhoSieuThi 
{
    static Scanner nhapKhoSieuThi = new Scanner(System.in);
    
    static List khoSieuThi = new ArrayList<>();
    static List khoSieuThi2 = new ArrayList<>();
    static List khoSieuThi3 = new ArrayList<>();

    public static void main(String[] args) 
    {
        danhSachThucPham(khoSieuThi);// DU LIEU MOI THUC PHAM
        danhSachDienMay(khoSieuThi2);// DU LIEU MOI DIEN MAY
        danhSachsSanhSu(khoSieuThi3);// DU LIEU MOI SANH SU

        int chonChucNang;
        do
        {
            System.out.println("******************* MENU SIEU THI *******************");
            System.out.println("[1] QUAN LY CAC SAN PHAM VE THUC PHAM");
            System.out.println("[2] QUAN LY CAC SAN PHAM VE DIEN MAY");
            System.out.println("[3] QUAN LY CAC SAN PHAM VE SANH SU");
            System.out.println("[4] TONG SO LUONG HANG HOA TRONG KHO SIEU THI ");
            System.out.println("[5] TONG GIA TRI HANG HOA KHO SIEU THI ");
            System.out.println("[6] IN RA TAT CA CAC SAN PHAM CO TRONG SIEU THI");
            System.out.println("[7] THOAT KHOI CHUONG TRINH ");
            System.out.println("Chon San Pham Can Thao Tac");
            chonChucNang = nhapKhoSieuThi.nextInt();
            System.out.println("Ban Da Chon Chuc Nang ["+chonChucNang+"]");
            switch(chonChucNang)
            {
                case 1:
                {
                    ChuongTrinhThucPham();
                    
                }break;

                case 2:
                {

                    ChuongTrinhDienMay();

                }break;

                case 3:
                {
                    
                    ChuongTrinhSanhSu();
                   
                }break;     
                
                case 4:
                {
                   
                    int soLuongHangHoaThucPham = khoSieuThi.size();
                    int soLuongHangHoaDienMay = khoSieuThi2.size();
                    int soLuongHangHoaSanhSu = khoSieuThi3.size();

                    System.out.println("So Luong Hoang Hoa Thuc Pham: " + soLuongHangHoaThucPham);
                    System.out.println("So Luong Hoang Hoa Dien May: " + soLuongHangHoaDienMay);
                    System.out.println("So Luong Hoang Hoa Sanh Su: " + soLuongHangHoaSanhSu);
                    System.out.println("Tong So Luong Hang Hoa Co Trong Sieu Thi Bao Gom Thuc Pham, Dien May, Sanh Su: "
                    + (soLuongHangHoaThucPham + soLuongHangHoaDienMay + soLuongHangHoaSanhSu));

                }break;

                case 5:
                {
                    System.out.println("Tong Gia Tri Nhap Kho Cua Sieu Thi");
                    
                }break;

                case 6:
                {
                    inThongTinThucPham(khoSieuThi);
                    inThongTinDienMay(khoSieuThi2);
                    inThongTinSanhSu(khoSieuThi3);
                }break;
            }

        }while(chonChucNang >=1 && chonChucNang <=6);

    }

   




// THUC PHAM
   
    public static void danhSachThucPham(List<ThucPham> khoSieuThi)
    {
        khoSieuThi.add(new ThucPham("Hanh Tay", 13000, 2));
        khoSieuThi.add(new ThucPham("Hanh Tim", 11000, 6));
        khoSieuThi.add(new ThucPham("Ca Chua", 9000, 12));
    }

    public static void nhapThucPham(List<ThucPham> khoSieuThi)
    {
      
        String name;
        double giaThanh;
        int soLuong;   

        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
            
        for(int i = 0; i <3; i++)
        {

            System.out.println("NHAP TEN THUCPHAMKT: ");
            name = nhapKhoSieuThi.nextLine();
            System.out.println("NHAP GIA THANH THUCPHAMKT: ");
            giaThanh = nhapKhoSieuThi.nextDouble();
            System.out.println("NHAP SO LUONG THUCPHAMKT: ");
            soLuong = nhapKhoSieuThi.nextInt();
            nhapKhoSieuThi.nextLine();           
            khoSieuThi.add(new ThucPham(name, giaThanh, soLuong));
          
            System.out.println("Thoi gian tao: "+ date);
        }     
    }

    public static void suaThucPham(int so,ThucPham thucPham, List<ThucPham> khoSieuThi)
    {
            thucPham.nhap();
            khoSieuThi.set(so, new ThucPham(thucPham.ten_ThucPham, thucPham.giaTien_ThucPham, thucPham.soLuongTonKho_ThucPham));
    
    }

    public static ThucPham timThucPhamTheoTen(String tenThucPham, List<ThucPham> khoSieuThi)
    {

        ThucPham result = null;
        for(ThucPham thucPham : khoSieuThi)
        {
            if(thucPham.ten_ThucPham.equals(tenThucPham))
            {
                result = thucPham;
            }
        }
        return result;
    }

    public static void xoaThucPham(String ten_ThucPham ,List<ThucPham> khoSieuThi)
    {

        ThucPham thucPham= timThucPhamTheoTen(ten_ThucPham, khoSieuThi);
        khoSieuThi.remove(thucPham);
        System.out.println("Da Xoa Thanh Cong");

    }

    public static void inThongTinThucPham(List<ThucPham> khoSieuThi)
    {

        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();

        for (ThucPham thucPham : khoSieuThi) 
        {    

            thucPham.inThongTinThucPham(); 
            System.out.println("Ngay Tao: "+ date);
            

        }
    }

    public static void sapXepThucPhamTheoDonGiaGiamDan(List<ThucPham> khoSieuThi)
    {
        Comparator<ThucPham> comp;
        comp = new Comparator<ThucPham>() 
        {
            @Override
            public int compare(ThucPham o1, ThucPham o2) {
                // TODO Auto-generated method stub
                return Double.compare(o1.giaTien_ThucPham, o2.giaTien_ThucPham);
            }            
        };
        Collections.sort(khoSieuThi, comp);
    }

    public static void xuatNgauNhienThongTinThucPham(List<ThucPham> khoSieuThi)
    {
        Collections.shuffle(khoSieuThi);
    }






    
// DIEN MAY
    public static void danhSachDienMay(List<DienMay> khoSieuThi2)
    {
        khoSieuThi2.add(new DienMay("Tivi Sony", 92000, 7));
        khoSieuThi2.add(new DienMay("Tu Lanh Toshiba", 17000, 2));
        khoSieuThi2.add(new DienMay("Noi Chien Khong Dau", 13500, 4));
    }

    public static void nhapDienMay(List<DienMay> khoSieuThi2)
    {
        String name;
        double giaThanh;
        int soLuong;      

        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();

        for(int i = 0; i <3; i++)
        {
            System.out.println("NHAP TEN DIEN MAY: ");
            name = nhapKhoSieuThi.nextLine();
            System.out.println("NHAP GIA THANH DIEN MAY: ");
            giaThanh = nhapKhoSieuThi.nextDouble();
            System.out.println("NHAP SO LUONG DIEN MAY: ");
            soLuong = nhapKhoSieuThi.nextInt();
            nhapKhoSieuThi.nextLine();           
            khoSieuThi2.add(new DienMay(name, giaThanh, soLuong));
            System.out.println("Thoi gian tao: "+ date);
        }      
    }
    
    public static DienMay timDienMayTheoTen(String tenDienMay, List<DienMay> khoSieuThi2)
    {
        DienMay result = null;
        for(DienMay dienMay : khoSieuThi2)
        {
            if(dienMay.ten_DienMay.equals(tenDienMay))
            {
                result = dienMay;
            }
        }
        return result;
    }

    public static void xoaDienMay(String ten_DienMay ,List<DienMay> khoSieuThi2)
    {
        DienMay dienMay= timDienMayTheoTen( ten_DienMay, khoSieuThi2);
            khoSieuThi2.remove(dienMay);
            System.out.println("Da Xoa Thanh Cong");  
    }

    public static void inThongTinDienMay(List<DienMay> khoSieuThi2)
    {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        for (DienMay dienMay : khoSieuThi2) 
        {
            dienMay.inThongTinDienMay();
            System.out.println("Ngay tao: "+ date);
        }
    }

    public static void sapXepDienMayTheoDonGiaGiamDan(List<DienMay> khoSieuThi2)
    {
        Comparator<DienMay> comp;
        comp = new Comparator<DienMay>() {
            @Override
            public int compare(DienMay o1, DienMay o2) {
                // TODO Auto-generated method stub
                return Double.compare(o1.giaTien_DienMay, o2.giaTien_DienMay);
            }            
        };
        Collections.sort(khoSieuThi2, comp);
    }

    public static void xuatNgauNhienThongTinDienMay(List<DienMay> khoSieuThi2)
    {
        Collections.shuffle(khoSieuThi2);
    }



    // SANH SU

    public static void danhSachsSanhSu(List<SanhSu> khoSieuThi3)
    {
        khoSieuThi3.add(new SanhSu("Chen Cao Cap Nhat Ban", 17000, 32));
        khoSieuThi3.add(new SanhSu("Bo 10 To An Pho Ha Noi", 220000, 56));
        khoSieuThi3.add(new SanhSu("Dia Cao Cap Nhat Ban", 18500, 24));
    }

    public static void nhapSanhSu(List<SanhSu> khoSieuThi3)
    {
        String name;
        double giaThanh;
        int soLuong;  
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();    
        for(int i = 0; i <3; i++)
        {
            System.out.println("NHAP TEN SANH SU: ");
            name = nhapKhoSieuThi.nextLine();
            System.out.println("NHAP GIA THANH SANH SU: ");
            giaThanh = nhapKhoSieuThi.nextDouble();
            System.out.println("NHAP SO LUONG SANH SU: ");
            soLuong = nhapKhoSieuThi.nextInt();
            nhapKhoSieuThi.nextLine();           
            khoSieuThi3.add(new SanhSu(name, giaThanh, soLuong));
            System.out.println("Thoi gian tao: "+ date);
        }      
    }

    public static SanhSu timSanhSuTheoTen(String tenSanhSu, List<SanhSu> khoSieuThi3)
    {
        SanhSu result = null;
        for(SanhSu sanhSu : khoSieuThi3)
        {
            if(sanhSu.ten_SanhSu.equals(tenSanhSu))
            {
                result = sanhSu;
            }
        }
        return result;
    }

    public static void thayDoiThongTinThucPham(List<ThucPham> khoSieuThi)
    {
       
    }

    public static void xoaSanhSu(String ten_SanhSu ,List<SanhSu> khoSieuThi3)
    {
        SanhSu sanhSu = timSanhSuTheoTen(ten_SanhSu, khoSieuThi3);
            khoSieuThi3.remove(sanhSu);
            System.out.println("Da Xoa Thanh Cong");  
    }

    public static void inThongTinSanhSu(List<SanhSu> khoSieuThi3)
    {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        for (SanhSu sanhSu : khoSieuThi3) 
        {
            sanhSu.inThongTinSanhSuKT();
            System.out.println("Ngay tao: "+ date);
        }
    }

    public static void sapXepSanhSuTheoDonGiaGiamDan(List<SanhSu> khoSieuThi3)
    {
        Comparator<SanhSu> comp;
        comp = new Comparator<SanhSu>() {
            @Override
            public int compare(SanhSu o1, SanhSu o2) {
                // TODO Auto-generated method stub
                return Double.compare(o1.giaTien_SanhSu, o2.giaTien_SanhSu);
            }            
        };
        Collections.sort(khoSieuThi3, comp);
    }

    public static void xuatNgauNhienThongTinSanhSu(List<SanhSu> khoSieuThi3)
    {
        Collections.shuffle(khoSieuThi3);
    }



                public static void ChuongTrinhThucPham()
                {
                    int xuLyThucPham;
                    do
                    {
                        System.out.println();
                        System.out.println("**************** THUC PHAM ****************");
                        System.out.println("[1] Nhap Them Thong Tin Thuc Pham Vao Danh Sach");
                        System.out.println("[2] Tim Kiem Thong Tin Thuc Pham Theo Ten Va In Ra Thong Tin Thuc Pham Da Tim");
                        System.out.println("[3] Tim Va Thay Doi Thong Tin Thuc Pham Theo Ten");
                        System.out.println("[4] Tim Va Xoa Thong Tin Thuc Pham Theo Ten");
                        System.out.println("[5] In Ra Thong Tin Danh Sach Thuc Pham Cap Nhat Moi Nhat");
                        System.out.println("[6] In Ra Danh Sach Tang Dan Theo Don Gia Cua Thuc Pham");
                        System.out.println("[7] In Ra Danh Sach Giam Dan Theo Don Gia Cua Thuc Pham");
                        System.out.println("[8] In Ra Danh Sach Thong Tin Thuc Pham Ngau Nhien");
                        System.out.println("[9] Out Ra Chuong Trinh Quan Ly Thuc Pham");
                        System.out.println("Nhap Chuc Nang Su Dung:");

                        xuLyThucPham = nhapKhoSieuThi.nextInt();
                        System.out.println("Ban Da Chon Chuc Nang ["+xuLyThucPham+"]");
                        nhapKhoSieuThi.nextLine();

                        if(xuLyThucPham == 1)//1 Nhap Them Thong Tin Thuc Pham Vao Danh Sach
                        {
                            nhapThucPham (khoSieuThi);
                        }

                        if(xuLyThucPham == 2)//2 Tim Kiem Thong Tin Thuc Pham Theo Ten Va In Ra Thong Tin Thuc Pham Da Tim
                        {
                            System.out.println("Nhap Ten Thuc Pham Can Tim: ");
                            String ten;
                            ten = nhapKhoSieuThi.nextLine();
                            ThucPham thucPham = timThucPhamTheoTen(ten, khoSieuThi);
                            if(thucPham != null)
                            {
                                thucPham.inThongTinThucPham();
                            }
                            else
                            {
                                System.out.println("Khong Co!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                            }
                        }

                        if(xuLyThucPham == 3)
                        {
                           
                        }

                        if(xuLyThucPham == 4)
                        {
                            System.out.println("Nhap Ten Thuc Pham Can Xoa: ");
                            String ten_ThucPham;
                            ten_ThucPham = nhapKhoSieuThi.nextLine();
                            ThucPham thucPham = timThucPhamTheoTen(ten_ThucPham, khoSieuThi);
                            if(thucPham != null)
                            {
                                xoaThucPham(ten_ThucPham, khoSieuThi);
                                System.out.println("Da Xoa Thanh Cong: "+" [ " + ten_ThucPham +" ] " + "Ra Khoi Danh Sach");
                            }
                            else
                            {
                                System.out.println("San Pham Khong Ton Tai: ");
                            }
                        }

                        if(xuLyThucPham == 5)//5 In Ra Thong Tin Danh Sach Thuc Pham Cap Nhat Moi Nhat
                        {
                            inThongTinThucPham(khoSieuThi);
                        }

                        if(xuLyThucPham == 6)//6  In Ra Danh Sach Tang Dan Theo Don Gia Cua Thuc Pham
                        {
                            sapXepThucPhamTheoDonGiaGiamDan(khoSieuThi);
                            inThongTinThucPham(khoSieuThi);
                        }

                        if(xuLyThucPham == 7)//6  In Ra Danh Sach Giam Dan Theo Don Gia Cua Thuc Pham
                        {
                            sapXepThucPhamTheoDonGiaGiamDan(khoSieuThi);
                            Collections.reverse(khoSieuThi);
                            inThongTinThucPham(khoSieuThi);
                        }

                        if(xuLyThucPham == 8)//8 In Ra Danh Sach Thong Tin Thuc Pham Ngau Nhien
                        {
                            xuatNgauNhienThongTinThucPham(khoSieuThi);
                            inThongTinThucPham(khoSieuThi);
                        }

                    }while(xuLyThucPham >= 1 && xuLyThucPham <=8);
                       
                }

                public static void ChuongTrinhDienMay()
                {
                    int xuLyDienMay;
                    do
                    {
                        System.out.println();
                        System.out.println("**************** DIEN MAY ****************");
                        System.out.println("[1] Nhap Them Thong Tin Dien May Vao Danh Sach");
                        System.out.println("[2] Tim Kiem Thong Tin Dien May Theo Ten Va In Ra Thong Tin Dien May Da Tim");
                        System.out.println("[3] Tim Va Thay Doi Thong Tin Dien May Theo Ten");
                        System.out.println("[4] Tim Va Xoa Thong Tin Dien May Theo Ten");
                        System.out.println("[5] In Ra Thong Tin Danh Sach Dien May Cap Nhat Moi Nhat");
                        System.out.println("[6] In Ra Danh Sach Tang Dan Theo Don Gia Cua Dien May");
                        System.out.println("[7] In Ra Danh Sach Giam Dan Theo Don Gia Cua Dien May");
                        System.out.println("[8] In Ra Danh Sach Thong Tin Dien May Ngau Nhien");
                        System.out.println("[9] Out Ra Chuong Trinh Quan Ly Dien May");
                        System.out.println("Nhap Chuc Nang Su Dung:");

                        xuLyDienMay = nhapKhoSieuThi.nextInt();
                        System.out.println("Ban Da Chon Chuc Nang ["+xuLyDienMay+"]");
                        nhapKhoSieuThi.nextLine();

                        if(xuLyDienMay == 1)
                        {
                            nhapDienMay(khoSieuThi2);
                        }

                        if(xuLyDienMay == 2)
                        {
                            System.out.println("Nhap Ten Dien May Can Tim: ");
                            String ten;
                            ten = nhapKhoSieuThi.nextLine();
                            DienMay dienMay = timDienMayTheoTen(ten, khoSieuThi2);
                            if(dienMay != null)
                            {
                                dienMay.inThongTinDienMay();
                            }
                            else
                            {
                                System.out.println("Khong Co!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                            }
                        }

                        if(xuLyDienMay == 3)
                        {

                        }

                        if(xuLyDienMay == 4)
                        {
                            System.out.println("Nhap Ten Dien May Can Xoa: ");
                            String ten_DienMay;
                            ten_DienMay = nhapKhoSieuThi.nextLine();
                            DienMay dienMay = timDienMayTheoTen(ten_DienMay, khoSieuThi2);
                            if(dienMay != null)
                            {
                                xoaDienMay(ten_DienMay, khoSieuThi2);
                                System.out.println("Da Xoa Thanh Cong: "+" [ " + ten_DienMay +" ] " + "Ra Khoi Danh Sach");
                            }
                            else
                            {
                                System.out.println("San Pham Khong Ton Tai: ");
                            }
                        }

                        if(xuLyDienMay == 5)
                        {
                            inThongTinDienMay(khoSieuThi2);
                            
                        }

                        if(xuLyDienMay == 6)
                        {
                            sapXepDienMayTheoDonGiaGiamDan(khoSieuThi2);
                            inThongTinDienMay(khoSieuThi2);
                        }

                        if(xuLyDienMay == 7)
                        {
                            sapXepDienMayTheoDonGiaGiamDan(khoSieuThi2);
                            Collections.reverse(khoSieuThi2);
                            inThongTinDienMay(khoSieuThi2);
                        }

                        if(xuLyDienMay == 8)
                        {
                            xuatNgauNhienThongTinDienMay(khoSieuThi2);
                            inThongTinDienMay(khoSieuThi2);
                        } 

                    }while(xuLyDienMay >= 1 && xuLyDienMay <= 8);  
                }

                public static void ChuongTrinhSanhSu()
                {
                int xuLySanhSu;
                    do
                    {
                        System.out.println();
                        System.out.println("**************** SANH SU ****************");
                        System.out.println("[1] Nhap Them Thong Tin Sanh Su Vao Danh Sach");
                        System.out.println("[2] Tim Kiem Thong Tin Sanh Su Theo Ten Va In Ra Thong Tin Sanh Su Da Tim");
                        System.out.println("[3] Tim Va Thay Doi Thong Tin Sanh Su Theo Ten");
                        System.out.println("[4] Tim Va Xoa Thong Tin Sanh Su Theo Ten");
                        System.out.println("[5] In Ra Thong Tin Danh Sanh Su May Cap Nhat Moi Nhat");
                        System.out.println("[6] In Ra Danh Sach Tang Dan Theo Don Gia Cua Sanh Su");
                        System.out.println("[7] In Ra Danh Sach Giam Dan Theo Don Gia Cua Sanh Su");
                        System.out.println("[8] In Ra Danh Sach Thong Tin Sanh Su Ngau Nhien");
                        System.out.println("[9] Out Ra Chuong Trinh Quan Ly Sanh Su");
                        System.out.println("Nhap Chuc Nang Su Dung:");

                        xuLySanhSu = nhapKhoSieuThi.nextInt();
                        System.out.println("Ban Da Chon Chuc Nang ["+xuLySanhSu+"]");
                        nhapKhoSieuThi.nextLine();

                        if(xuLySanhSu == 1)
                        {
                            nhapSanhSu(khoSieuThi3);
                        }

                        if(xuLySanhSu == 2)
                        {
                            System.out.println("Nhap Ten SANH SU Can Tim: ");
                            String ten;
                            ten = nhapKhoSieuThi.nextLine();
                            SanhSu sanhSu = timSanhSuTheoTen(ten, khoSieuThi3);
                            if(sanhSu != null)
                            {
                                sanhSu.inThongTinSanhSuKT();
                            }
                            else
                            {
                                System.out.println("Khong Co!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                            }
                        }

                        if(xuLySanhSu == 3)
                        {

                        }

                        if(xuLySanhSu == 4)
                        {
                            System.out.println("Nhap Ten Sanh Su Can Xoa: ");
                            String ten_SanhSu;
                            ten_SanhSu = nhapKhoSieuThi.nextLine();
                            SanhSu sanhSu = timSanhSuTheoTen(ten_SanhSu, khoSieuThi3);
                            if(sanhSu != null)
                            {
                                xoaSanhSu(ten_SanhSu, khoSieuThi3);
                                System.out.println("Da Xoa Thanh Cong: "+" [ " + ten_SanhSu +" ] " + "Ra Khoi Danh Sach");
                            }
                            else
                            {
                                System.out.println("San Pham Khong Ton Tai: ");
                            }
                        }

                        if(xuLySanhSu == 5)
                        {
                            inThongTinSanhSu(khoSieuThi3);   
                        }

                        if(xuLySanhSu == 6)
                        {
                            sapXepSanhSuTheoDonGiaGiamDan(khoSieuThi3);   
                            inThongTinSanhSu(khoSieuThi3);
                        }

                        if(xuLySanhSu == 7)
                        {
                            sapXepSanhSuTheoDonGiaGiamDan(khoSieuThi3);
                            Collections.reverse(khoSieuThi3);
                            inThongTinSanhSu(khoSieuThi3);
                        }

                        if(xuLySanhSu == 8)
                        {
                            xuatNgauNhienThongTinSanhSu(khoSieuThi3);
                            inThongTinSanhSu(khoSieuThi3);
                        }

                    }while(xuLySanhSu >= 1 && xuLySanhSu <= 8);  
                } 




}
