package behavioral.chain_of_responsibility.TienDien;

public class BacCaoNhat implements ITienDien{
    float giaBan;
    float tongTien;
    public BacCaoNhat(float giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public ITienDien bacTiepTheo(ITienDien capBac) {
        return null;
    }
    @Override
    public void soKwh(float soKw) {
        tongTien += soKw * giaBan;
        System.out.println("Tổng tiền điện: " + tongTien);
    }
}
