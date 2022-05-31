package behavioral.template_method.hoadon;

public class Main {
    public static void main(String[] args) {
        factoryHoaDon sp = new factoryHoaDon();
        HoaDon h1 = sp.creatGioHang(TypeKH.KimCuong) ;
        HoaDon h2 = sp.creatGioHang(TypeKH.KimCuong) ;
        MatHang m1 = new MatHang("coca",10,100000);
        MatHang m2 = new MatHang("pepsi",5,10000);

        h1.dsHangHoa.add(m1);
        h1.dsHangHoa.add(m2);

        h2.dsHangHoa.add(m1);
        h2.dsHangHoa.add(m1);

        h1.HienThi();
        sp.addgiohang(h1);
        sp.addgiohang(h2);
        sp.in();
    }
}
