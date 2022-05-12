package behavioral.chain_of_responsibility.ATM;

public class MainATM {
    public static void main(String[] args) {
        IATM motTram = new LoaiTien(100);
        IATM namMuoi = new LoaiTien(50);
        IATM haiMuoi = new LoaiTien(20);
        IATM hai = new LoaiTien(2);
        IATM mot = new MotNghin(1);
        motTram.menhGiaThapHon(namMuoi)
                .menhGiaThapHon(haiMuoi)
                .menhGiaThapHon(hai)
                .menhGiaThapHon(mot);
        motTram.soTien(2673f);

    }
}
