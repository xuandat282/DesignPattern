package behavioral.template_method.giohang;

public class ThanhToanCOD extends gioHang{
    @Override
    float tinhChietKhau() {
        if(tinhTien() > 1000000) return tinhTien()*0.05f;
        return  0;
    }
}
