package kiemtra.giuaky;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Sach sach1 = new Sach.Builder()
                .addTuaDe("Mat biec")
                .addSoTrang(300)
                .addTacGia("Nguyen Nhat Anh")
                .addChuong("1,2,3")
                .build();
        System.out.println(sach1.hienThi());
    }
}
