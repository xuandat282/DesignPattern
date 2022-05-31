package behavioral.template_method.giohang;

public class ThanhToanOnline extends gioHang {
    @Override
    float tinhChietKhau() {
        if(tinhTien() > 1000000) return tinhTien()*0.05f;
        return  tinhTien()*0.03f;
    }
}
