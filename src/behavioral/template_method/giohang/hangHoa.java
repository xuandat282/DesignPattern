package behavioral.template_method.giohang;

public class hangHoa {
    String ten;
    int sl;
    float dongia;

    public hangHoa(String ten, int sl, float dongia) {
        this.ten = ten;
        this.sl = sl;
        this.dongia = dongia;
    }

    @Override
    public String toString() {
        return "hangHoa{" +
                "ten='" + ten + '\'' +
                ", sl=" + sl +
                ", dongia=" + dongia +
                ", thanh tien =" + sl*dongia +
                '}';
    }
}
