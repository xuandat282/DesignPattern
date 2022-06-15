package behavioral.observer.topic;

import java.util.List;

public class thanhvienB implements Topic.INhanThongTin{
    Topic tp;

    public thanhvienB(Topic tp) {
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
        if(trangthai == 1 || trangthai == 2){
            int temp = 1;
            System.out.println("Danh sach cac thong tin B nhan : ");
            for (String i: dsthongtin ){
                System.out.println(temp + " : " + i);
                temp++;
            }
        }
    }
}
