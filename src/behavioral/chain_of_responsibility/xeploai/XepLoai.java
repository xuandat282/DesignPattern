package behavioral.chain_of_responsibility.xeploai;

public class XepLoai implements IXepLoai{
    String nhan;
    float min; // ngưỡng
    IXepLoai caoHon; // thành phần đứng sau
    public XepLoai(String nhan, float min) {
        this.nhan = nhan;
        this.min = min;
    }

    @Override
    public IXepLoai thietLapCaoHon(IXepLoai xepLoai) {
        caoHon = xepLoai;
        return xepLoai;
    }

    @Override
    public String xepLoai(float diem) {
        if(diem >= min)
            return nhan;
        return caoHon.xepLoai(diem);
    }
}
