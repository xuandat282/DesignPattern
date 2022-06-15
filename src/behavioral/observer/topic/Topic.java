package behavioral.observer.topic;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    INhanThongTin thongtin;
    List<String> dsthongtin = new ArrayList<String>();
    // trang thai : 0:khong co gi, 1:tao moi, 2:cap nhat
    int trangthai = 0;

    public void attach(INhanThongTin thongTin){
        this.thongtin = thongTin;
    }
    public void detach(){
        this.thongtin = null;
    }

    public void taoThongtin(String tt)
    {
        trangthai = 1;
        dsthongtin.add(tt);
    }
    public void capnhatThongtin(){
        trangthai = 2;
        dsthongtin.set(dsthongtin.size()-1, "haha");
    }

    public static interface INhanThongTin{
        void nhanThongtin(List<String> dsthongtin, int trangthai);
    }
}
