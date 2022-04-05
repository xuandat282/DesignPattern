package creational.bt1_builder;

public class CTHD{
    String tenSP;
    int soLuong;
    double donGia;
    int chietKhau;
    public CTHD(String tenSP, int soLuong, double donGia, int chietKhau) {
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }
    @Override
    public String toString() {
        return "CTHD{" +
                "tenSP='" + tenSP + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                ", chietKhau=" + chietKhau +
                '}';
    }
}
