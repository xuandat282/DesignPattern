package behavioral.stratery.bt2;

public class ThanhToanCOD implements IThanhToan {
    @Override
    public double thanhToan(double tienHang) {
        if(tienHang > 2000000){
            return tienHang * 0.98;
        }
        else return tienHang;
    }
}
