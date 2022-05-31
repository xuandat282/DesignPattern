package behavioral.template_method.hoadon;

public class ThanThiet extends HoaDon{
    @Override
    public double tinhChietKhau() {
        if (tinhTien() == 500000)
            return tinhTien() * 0.02;
        else return 0;
    }
}
