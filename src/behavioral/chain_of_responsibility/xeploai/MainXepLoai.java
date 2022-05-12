package behavioral.chain_of_responsibility.xeploai;

public class MainXepLoai {
    public static void main(String[] args) {
        IXepLoai xuatSac = new XepLoai("Xuat sac", 9);
        IXepLoai gioi = new XepLoai("gioi", 8);
        IXepLoai kha = new XepLoai("kha", 7);
        IXepLoai tbkha = new XepLoai("tb kha", 6);
        IXepLoai trungBinh = new XepLoai("Trung binh", 5);
        IXepLoai yeuKem = new XepLoai("Yeu kem", 0);
        xuatSac.thietLapCaoHon(gioi)
                .thietLapCaoHon(kha)
                .thietLapCaoHon(tbkha)
                .thietLapCaoHon(trungBinh)
                .thietLapCaoHon(yeuKem);
        System.out.println("Diem 6.5 " + xuatSac.xepLoai(6.5f));
    }
}
