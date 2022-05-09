package behavioral.observer.atm;

public class TaiKhoan implements ATM.ITaiKhoanATM{
    String ten;
    int soDu;
    ATM atm;

    public TaiKhoan(String ten, int soDu, ATM atm) {
        this.ten = ten;
        this.soDu = soDu;
        this.atm = atm;
    }
    public void duaTheVaoATM(){
        atm.attach(this);
    }
    public void rutThe(){
        atm.detach();
    }

    @Override
    public boolean kiemTraSoDu(int soTienRut) {
        if((soDu - soTienRut) >= 50)
            return true;
        else
            return false;
    }

    @Override
    public void thongBao(int soTienRut, boolean thanhCong) {
        System.out.println("Tài khoản: " + ten);
        if (thanhCong){
            System.out.println("Số dư ban đầu: " + soDu);
            soDu = soDu - soTienRut;
            System.out.println("Số tiền rút: " + soTienRut);
            System.out.println("Số dư còn lại: " + soDu);

        }
        else {
            System.out.println("Giao dịch không thành công!");
            System.out.println("Số dư tài khoản: " + soDu);
        }
    }


}
