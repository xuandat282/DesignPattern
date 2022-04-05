package stratery.bt3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.DATE, 28);
        cal1.set(Calendar.MONTH, 2);
        cal1.set(Calendar.YEAR, 2001);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.DATE, 28);
        cal2.set(Calendar.MONTH, 2);
        cal2.set(Calendar.YEAR, 2001);

        SinhVien s1 = new SinhVien("Y", cal1.getTime(),10);
        SinhVien s2 = new SinhVien("Tho", cal2.getTime(),6);
        SinhVien s3 = new SinhVien("Dat", cal2.getTime(),8);

        QLSV ql = new QLSV();

        ql.svs.add(s1);
        ql.svs.add(s2);
        ql.svs.add(s3);

//        ISoSanh iSoSanh = new SoSanhTheoDiem();
//        ql.setiSoSanh(iSoSanh);
//        ql.sapXep();
//        ql.inDS();

        ISoSanh iSoSanh1 = new SoSanhTheoTen();
        //ql.setiSoSanh(iSoSanh1);
        ql.sapXep();
        ql.inDS();
    }

}