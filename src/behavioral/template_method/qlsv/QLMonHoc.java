package behavioral.template_method.qlsv;

public class QLMonHoc extends QLData<MonHoc>{
    @Override
    protected int khoa(MonHoc monHoc) {
        return monHoc.getId();
    }

    @Override
    public void hienThiDoiTuong(MonHoc monHoc) {
        System.out.println(monHoc.toString());
    }
}
