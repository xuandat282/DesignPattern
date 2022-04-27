package kiemtra.giuaky;

import creational.bt4.Election;

import java.util.ArrayList;
import java.util.List;

public class Sach {
    private static Sach instance;
    String tuaDe;
    int soTrang;
    String tacGia;
    String chuong;
    public Sach(Builder builder) {
        this.tuaDe = builder.tuaDe;
        this.soTrang = builder.soTrang;
        this.tacGia = builder.tacGia;
        this.chuong = builder.chuong;
    }

    public String hienThi() {
        return "Sach{" +
                "tuaDe='" + tuaDe + '\'' +
                ", soTrang=" + soTrang +
                ", tacGia='" + tacGia + '\'' +
                ", chuong='" + chuong + '\'' +
                '}';
    }

    public static class Builder{
        String tuaDe;
        int soTrang;
        String tacGia;
        String chuong;

        public Builder addTuaDe(String s){
            this.tuaDe = s;
            return this;
        }
        public Builder addSoTrang(int t){
            this.soTrang = t;
            return this;
        }
        public Builder addTacGia(String s){
            this.tacGia = s;
            return this;
        }
        public Builder addChuong(String chuong){
            this.chuong = chuong;
            return this;
        }

        public Sach build(){
            return new Sach(this);
        }
    }
}
