package behavioral.template_method.giohang;

import java.util.ArrayList;
import java.util.List;

public abstract class gioHang {
    List<hangHoa> hd = new ArrayList<hangHoa>();

    float tinhTien() {
        int tong = 0 ;
        for(hangHoa h : hd)
        {
            tong += h.sl*h.dongia;
        }
        return tong;
    }

    abstract float tinhChietKhau();

    void hienthi()
    {
        hd.forEach(hangHoa ->System.out.println( hangHoa.toString()));
        System.out.println("tong tien la  :" +tinhTien());
        System.out.println("chiet khau  la  :" +tinhChietKhau());
        System.out.println("tien can thanh toan : " + (tinhTien() - tinhChietKhau()));
    }
}
