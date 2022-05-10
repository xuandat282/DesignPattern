package behavioral.chainofresponsibility;

public interface IXepLoai {
    IXepLoai thietLapCaoHon(IXepLoai xepLoai);
    String xepLoai(float diem);
    
}
