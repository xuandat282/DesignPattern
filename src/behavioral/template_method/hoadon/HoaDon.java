package behavioral.template_method.hoadon;


import java.util.ArrayList;
import java.util.List;

public abstract class HoaDon {
    List<MatHang> dsHangHoa = new ArrayList<>();

    public double tinhTien(){
        double Tong = 0;
        for (MatHang item: dsHangHoa)
            Tong = item.getDonGia() * item.getSoLuong() + Tong;
        return Tong;
    }

    public void HienThi() {
        System.out.println("Danh sách mặt hàng: ");
        for (MatHang item : dsHangHoa){
            System.out.println("Tên mặt hàng: " + item.ten +
                    " -- Số lượng: " + item.soLuong +
                    " -- Đơn giá: " + item.donGia +
                    " -- Thành tiền: " + item.soLuong*item.donGia);
        }
        System.out.println("\nTổng tiền mua hàng: " + tinhTien());
        System.out.println("Tiền chiết khấu: " + tinhChietKhau());
        System.out.println("Tiền khách cần thanh toán: " + (tinhTien()-tinhChietKhau()));
    }

    public abstract double tinhChietKhau();
}
