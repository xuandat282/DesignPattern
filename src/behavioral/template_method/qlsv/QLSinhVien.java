package behavioral.template_method.qlsv;

public class QLSinhVien extends QLData<SinhVien>{

    @Override
    protected int khoa(SinhVien sinhVien) {
        return sinhVien.getId();
    }

    @Override
    public void hienThiDoiTuong(SinhVien sinhVien) {
        System.out.println(sinhVien.toString());
    }


}
