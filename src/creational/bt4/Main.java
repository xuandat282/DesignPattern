package creational.bt4;

public class Main {
    public static void main(String[] args){
    User Dat = new User("Dat");
    User Y = new User("Y");
    User Tho = new User("Tho");
    Dat.Vote(UngVien.JoeBiden);
    Dat.Vote(UngVien.DonaldTrump);
    Y.Vote(UngVien.JoeBiden);
    Tho.Vote(UngVien.DonaldTrump);
    System.out.println("Donald: " + Election.Instance().getDonaldTrump());
    System.out.println("Joe: " + Election.Instance().getJoeBiden());
    }
}
