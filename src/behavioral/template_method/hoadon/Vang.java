package behavioral.template_method.hoadon;

public class Vang extends HoaDon{
    @Override
    public double tinhChietKhau() {
        if (tinhTien() > 500000)
            return tinhTien() * 0.03;
        else if (tinhTien() > 1000000)
            return tinhTien() * 0.05;
        else return 0;
    }
}
