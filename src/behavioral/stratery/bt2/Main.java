package behavioral.stratery.bt2;

public class Main {

    public static void main(String[] args) {
        GioHang g1 = new GioHang();
        GioHang g2 = new GioHang();

        HangHoa h1 = new HangHoa("h1",2100000, "xin");
        HangHoa h2 = new HangHoa("h1",950000, "ga");

        g1.hh.add(h1);
        g1.hh.add(h2);

        g2.hh.add(h1);
        g2.hh.add(h2);

        IThanhToan iThanhToan = new ThanhToanCOD();
        g1.setHinhThucTT(iThanhToan);
        System.out.println(g1.thanhToan());

        IThanhToan iThanhToan2 = new ThanhToanOline();
        g2.setHinhThucTT(iThanhToan2);
        System.out.println(g2.thanhToan());
    }
}
