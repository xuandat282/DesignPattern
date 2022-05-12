package behavioral.chain_of_responsibility.xeploai;

public class YeuKem implements IXepLoai{
    String nhan;
    float min;
    @Override
    public IXepLoai thietLapCaoHon(IXepLoai xepLoai) {
        return null;
    }

    @Override
    public String xepLoai(float diem) {
        if (diem >= min)
            return nhan;
        return "Diem ngoai pham vi";
    }
}
