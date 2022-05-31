package behavioral.chain_of_responsibility.TienDien;

public class BacCaoNhat implements ITienDien{
    float giaBan;
    float min;
    public BacCaoNhat(float giaBan, float min) {
        this.giaBan = giaBan;
        this.min = min;
    }
    @Override
    public ITienDien bacTiepTheo(ITienDien capBac) {
        return null;
    }
    @Override
    public double soKwh(float soKw) {
        return (soKw - min) * giaBan;
    }
}
