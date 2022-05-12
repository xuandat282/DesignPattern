package behavioral.chain_of_responsibility.ATM;

public class LoaiTien implements IATM{
    float menhGia;
    IATM thapHon;
    int soLuong;

    public LoaiTien(float menhGia) {
        this.menhGia = menhGia;
    }

    @Override
    public IATM menhGiaThapHon(IATM menhGia) {
        thapHon = menhGia;
        return menhGia;
    }

    @Override
    public void soTien(float tien) {
        while (tien >= menhGia){
            tien -= menhGia;
            soLuong++;
        }
        System.out.println("Mệnh giá " + menhGia + "K" + " Số lượng " + soLuong);
        thapHon.soTien(tien);
    }
}
