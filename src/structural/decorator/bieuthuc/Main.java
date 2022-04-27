package structural.decorator.bieuthuc;

public class Main {
    public static void main(String[] args){
        BieuThuc bt = new BieuThucDonGian(8);
        bt = new Cong(bt, 6);
        bt = new Chia(bt, 2);
        bt = new Nhan(bt, 5);
        bt = new Cong(bt, 8);
        bt = new Tru(bt, 4);
        bt = new TriTuyetDoi(bt);
        System.out.println(bt.giaTri());
        System.out.println(bt.bieuThuc());
    }
}
