package behavioral.chain_of_responsibility.TienDien;

public class CapBac implements ITienDien{
    float giaBan;
    float min, max;
    ITienDien bacTiepTheo;

    public CapBac(float giaBan, float min, float max) {
        this.giaBan = giaBan;
        this.min = min;
        this.max = max;
    }

    @Override
    public ITienDien bacTiepTheo(ITienDien capBac) {
        return this.bacTiepTheo = capBac;
    }

    @Override
    public double soKwh(float soKw) {
        if (soKw <= max) {
            return (soKw - min)*giaBan;
        }else
            return (max - min) * giaBan + bacTiepTheo.soKwh(soKw);
    }
}
