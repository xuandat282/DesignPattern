package behavioral.stratery.bt3;

import java.util.Date;

public class SinhVien {

    private String hoTen;
    private Date ngaySinh;
    private float diemTB;

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }


    public Date getNgaySinh() {
        return ngaySinh;
    }


    public String getHoTen() {
        return hoTen;
    }

    public float getDiemTB() {
        return diemTB;
    }



    public SinhVien(String hoTen, Date ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
//        return super.toString();
        return "Ho ten: " + hoTen + "\n" +
                "Ngay Sinh: " + ngaySinh.toString() + "\n" +
                "DiemTB: " + diemTB + "\n";
    }
}
