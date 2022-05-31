package behavioral.chain_of_responsibility.ATM;


public interface IATM {
    IATM menhGiaThapHon(IATM menhGia);
    void soTien(float soTien);
}
