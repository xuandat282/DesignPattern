package creational.bt1_builder;

import java.util.Date;

public class Main {
    public static void main(String[] args){
      HoaDon hd1 = new HoaDon.HoaDonBuilder()
              .addHeader("hd001",new Date(), "Xuan Dat")
              .addCTHD("Banh trang", 3, 10000d, 0 )
              .addCTHD("Banh mi", 2, 15000d, 0 )
              .addCTHD("Ca phe", 3, 20000d, 0 )
              .addCTHD("Kem", 1, 10000d, 0 )
              .build();
      hd1.showCTDH();
    }
}
