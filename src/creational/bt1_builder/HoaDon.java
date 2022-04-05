package creational.bt1_builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HoaDon {
    HoaDonHeader hoaDonHeader;
    ArrayList<CTHD> cthds = new ArrayList<CTHD>();

    public HoaDon(HoaDonBuilder hoaDonBuilder) {
        this.hoaDonHeader = hoaDonBuilder.hoaDonHeader;
        this.cthds = hoaDonBuilder.cthds;
    }
    public void showCTDH(){
        System.out.println("Hoa don: " +  hoaDonHeader.toString());
        System.out.println("Thong tin chi tiet hoa don: ");
        cthds.forEach(cthd -> System.out.println(cthd.toString()));
    }
    public static class HoaDonBuilder {
        HoaDonHeader hoaDonHeader;
        ArrayList<CTHD> cthds = new ArrayList<CTHD>();
        public HoaDonBuilder addCTHD(String tenSP, int soLuong, double donGia, int chietKhau){
            this.cthds.add(new CTHD(tenSP, soLuong, donGia, chietKhau));
            return this;
        }
        public HoaDonBuilder addHeader(String maHD, Date ngayBan, String tenKH){
            this.hoaDonHeader = new HoaDonHeader(maHD, ngayBan, tenKH);
            return this;
        }
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}
