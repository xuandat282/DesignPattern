package behavioral.template_method.qlsv;

public class QLSVMain {
    public static void main(String[] args) {
        QLData<SinhVien> qlsv1 = new QLSinhVien();
        SinhVien dat = new SinhVien(001, "61132915", "Xuan Dat", "28/2", "NT");
        SinhVien dat2 = new SinhVien(001, "61132915", "Huynh Xuan Dat", "28/2", "NT");
                qlsv1.them(dat);
                qlsv1.hienThi();
                qlsv1.capNhat(dat2);
                qlsv1.hienThi();
                QLData<MonHoc> qlmh = new QLMonHoc();
    }
}
