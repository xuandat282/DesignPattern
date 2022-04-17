package behavioral.stratery.bt3;

import java.util.ArrayList;
import java.util.List;

public class QLSV {

    ISoSanh<SinhVien> soSanh;
    List<SinhVien> svs = new ArrayList<SinhVien>();
    public void sapXep() {
        svs.sort((o1, o2) -> {return soSanh.soSanh(o1, o2);});
    }
    public void inDS() {
        svs.forEach((t) -> {
            System.out.println(t.toString());
        }
        );
    }
}
