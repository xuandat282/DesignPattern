package behavioral.observer.atm;

public class ATMMain {
    public static void main(String[] args){
        ATM atm = new ATM();
        TaiKhoan dat = new TaiKhoan("Đạt", 2000, atm);
        TaiKhoan xuan = new TaiKhoan("Xuân", 1500, atm);
        System.out.println("Giao dịch lần 1:");
        dat.duaTheVaoATM();
        atm.rutTien(500);
        System.out.println("Giao dịch lần 2:");
        atm.rutTien(300);
        dat.rutThe();
        System.out.println("Giao dịch lần 3:");
        xuan.duaTheVaoATM();
        atm.rutTien(300);
        xuan.rutThe();
        System.out.println("Giao dịch lần 3:");
        atm.rutTien(300);
    }
}
