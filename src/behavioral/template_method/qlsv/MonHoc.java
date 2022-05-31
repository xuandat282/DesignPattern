package behavioral.template_method.qlsv;

public class MonHoc {
    int id;
    String maMH, tenMH, soTc;

    public MonHoc(int id, String maMH, String tenMH, String soTc) {
        this.id = id;
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTc = soTc;
    }

    public int getId() {
        return id;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public String getSoTc() {
        return soTc;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "id=" + id +
                ", maMH='" + maMH + '\'' +
                ", tenMH='" + tenMH + '\'' +
                ", soTc='" + soTc + '\'' +
                '}';
    }
}
