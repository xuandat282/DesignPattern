package behavioral.chain_of_responsibility.ATM;

public class MotNghin implements IATM{
    int soLuong;
    float menhGia;

    public MotNghin(float menhGia) {
        this.menhGia = menhGia;
    }

    @Override
    public IATM menhGiaThapHon(IATM menhGia) {
        return null;
    }

    @Override
    public void soTien(float tien) {
        while (tien >= menhGia){
            tien -= menhGia;
            soLuong++;
        }
        System.out.println("Mệnh giá " + menhGia + "K" + " Số lượng " + soLuong);
    }
}
