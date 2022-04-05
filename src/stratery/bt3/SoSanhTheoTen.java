package stratery.bt3;

public class SoSanhTheoTen implements ISoSanh <SinhVien>{

    public int soSanh(SinhVien o1, SinhVien o2) {
        return o1.getHoTen().compareTo(o2.getHoTen());
    }
}
