package behavioral.template_method.giohang;

import java.util.ArrayList;
import java.util.List;

public class factoryGioHang {
    List<gioHang> dshd = new ArrayList<gioHang>();

    void addgiohang(gioHang gioHang)
    {
        dshd.add(gioHang);
    }
    void in()
    {
        System.out.println("danh sach thanh tien cua tat ca hang hoa");
        dshd.forEach(gioHang -> System.out.println((gioHang.tinhTien()-gioHang.tinhChietKhau())));
    }
    gioHang creatGioHang(TypeThanhToan tt)
    {
        if(tt.equals(TypeThanhToan.COD)) {
            return new ThanhToanCOD();
        }
        else if(tt.equals(TypeThanhToan.Online))
        {
            return new ThanhToanOnline();
        }
        else return null;
    }
}

