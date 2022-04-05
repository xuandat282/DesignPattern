package stratery.bt1;

public class context {

    private ITinh tinhToan;
    public ITinh getTinhToan() {
        return tinhToan;
    }

    public void setTinhToan(ITinh tinhToan) {
        this.tinhToan = tinhToan;
    }

    public float tinhToan(float a, float b) {
        return tinhToan.tinh(a,b);
    }

}
