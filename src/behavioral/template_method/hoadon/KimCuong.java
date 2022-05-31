package behavioral.template_method.hoadon;

public class KimCuong extends HoaDon{
    @Override
    public double tinhChietKhau() {
        if (tinhTien() > 500000)
            return tinhTien() * 0.03;
        else if (tinhTien() > 1000000)
            return tinhTien() * 0.05;
        else if (tinhTien() > 1500000)
            return tinhTien() * 0.06;
        else return 0;
    }
}
