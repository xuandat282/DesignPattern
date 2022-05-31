package behavioral.chain_of_responsibility.TienDien;

public interface ITienDien {
    ITienDien bacTiepTheo(ITienDien capBac);
    double soKwh(float soKw);
}
