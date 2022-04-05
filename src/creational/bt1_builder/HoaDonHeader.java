package creational.bt1_builder;

import java.util.Date;

public class HoaDonHeader{
    String maHD;
    Date ngayBan;
    String tenKH;

    public HoaDonHeader(String maHD, Date ngayBan, String tenKH) {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" +
                "maHD='" + maHD + '\'' +
                ", ngayBan=" + ngayBan +
                ", tenKH='" + tenKH + '\'' +
                '}';
    }
}
