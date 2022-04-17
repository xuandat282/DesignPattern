package structural.decorator.bieuthuc;

public class Main {
    public static void main(String[] args){
        BieuThuc bt = new BieuThucDonGian(2);
        bt = new Cong(bt, 3);
        bt = new Tru(bt, 2);
        bt = new Nhan(bt, 3);
        bt = new Chia(bt, 2);
        System.out.println(bt.giaTri());
        System.out.println(bt.bieuThuc());
    }
}
