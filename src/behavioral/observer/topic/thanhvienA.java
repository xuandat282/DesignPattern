package behavioral.observer.topic;

import java.util.List;

public class thanhvienA implements Topic.INhanThongTin{
    Topic tp;

    public thanhvienA(Topic tp) {
        this.tp = tp;
        tp.attach(this);
    }

    public void huyDangki(){
        tp.detach();
    }

    @Override
    public void nhanThongtin(List<String> dsthongtin, int trangthai) {
        if(trangthai == 2){
            tp.capnhatThongtin();
        }
        if (trangthai == 1 || trangthai == 2) {
            System.out.println("Tin moi nhat la : ");
            System.out.println(dsthongtin.get(dsthongtin.size() - 1));
        }
    }
}
