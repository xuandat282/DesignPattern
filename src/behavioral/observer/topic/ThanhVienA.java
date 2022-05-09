package behavioral.observer.topic;

public class ThanhVienA implements Topic.ITopic{
    Topic topic;

    public ThanhVienA(Topic topic) {
        this.topic = topic;
        topic.attach(this);
    }

    void huyDangKy(Topic topic){
        topic.detach(this);
    }

    @Override
    public void update(String tin, boolean them) {
        if (them){
            System.out.println("Thêm tin A: " + tin);
        }else System.out.println(("Cập nhật A: " + tin));
    }
}
