package behavioral.chain_of_responsibility;

public interface IXepLoai {
    IXepLoai thietLapCaoHon(IXepLoai xepLoai);
    String xepLoai(float diem);

}
