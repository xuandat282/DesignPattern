package behavioral.observer.topic;

public class Main {
    public static void main(String[] args) {
        Topic tp = new Topic();
        tp.taoThongtin("Hello");
        tp.taoThongtin("Chao");

        thanhvienA tvA = new thanhvienA(tp);
        thanhvienB tvB = new thanhvienB(tp);

        tvA.nhanThongtin(tp.dsthongtin, tp.trangthai);
        tvB.nhanThongtin(tp.dsthongtin, tp.trangthai);
        tp.capnhatThongtin();
        tvA.nhanThongtin(tp.dsthongtin, tp.trangthai);
        tvB.nhanThongtin(tp.dsthongtin, tp.trangthai);
    }
}
