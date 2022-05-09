package behavioral.observer.topic;

public class TinMain {
    public static void main(String[] args) {
        Topic topic = new Topic();
        ThanhVienB b = new ThanhVienB(topic);
        String t1 = "Di nhau";
        topic.taoTin(t1);
        topic.capNhatTin(t1,"Di pay");
        topic.taoTin("Di ve");
        b.huyDangKy(topic);
        topic.taoTin("Di ngu");
        ThanhVienA a = new ThanhVienA(topic);
        topic.taoTin("di cf");
        System.out.println(topic);


    }
}
