package behavioral.stratery.bt2;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    IThanhToan hinhThucTT;

    public IThanhToan getHinhThucTT() {
        return hinhThucTT;
    }
    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    List<HangHoa> hh = new ArrayList<HangHoa>();

    public double thanhToan(){
        double Tong = 0;
        for (HangHoa item: hh){
            Tong = hinhThucTT.thanhToan(item.getGia()) + Tong;
        }
        return Tong;
    }
}
