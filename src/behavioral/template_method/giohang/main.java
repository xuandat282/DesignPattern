package behavioral.template_method.giohang;

public class main {
    public static void main(String[] args) {
        factoryGioHang sp = new factoryGioHang();

        hangHoa h1 = new hangHoa("sach",2,10000);
        hangHoa h2 = new hangHoa("but",1,2000);

        gioHang gh = sp.creatGioHang(TypeThanhToan.COD);
        gh.hd.add(h1);
        gh.hd.add(h2);

        gioHang gh1 = sp.creatGioHang(TypeThanhToan.Online);
        gh1.hd.add(h1);
        gh1.hd.add(h1);

        sp.addgiohang(gh);
        sp.addgiohang(gh1);
        sp.in();

    }
}
