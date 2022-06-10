package behavioral.chain_of_responsibility.TienDien;

public class MainTienDien {
    public static void main(String[] args) {
        ITienDien b1 = new CapBac(1678, 0, 50);
        ITienDien b2 = new CapBac(1734, 50, 100);
        ITienDien b3 = new CapBac(2014, 100, 200);
        ITienDien b4 = new CapBac(2536, 200, 300);
        ITienDien b5 = new CapBac(2834, 300, 400);
        ITienDien b6 = new BacCaoNhat(2927, 400);
        b1.bacTiepTheo(b2)
                .bacTiepTheo(b3)
                .bacTiepTheo(b4)
                .bacTiepTheo(b5)
                .bacTiepTheo(b6);
        System.out.println(b1.soKwh(202));
    }
}
