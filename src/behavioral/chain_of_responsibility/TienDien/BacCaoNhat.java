package behavioral.chain_of_responsibility.TienDien;

public class BacThapNhat implements ITienDien{
    float giaBan;
    float min;
    float tongTien;
    public BacThapNhat(float giaBan, float min) {
        this.giaBan = giaBan;
        this.min = min;
    }

    @Override
    public ITienDien bacTiepTheo(ITienDien capBac) {
        return null;
    }
    @Override
    public float soKwh(float soKw) {
        tongTien = tongTien + ((soKw - min) * giaBan);
        soKw = min;
        System.out.println("Số tiền điện: " + tongTien);
    }
}
