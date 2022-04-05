package creational.bt4;

public class User{
    public String name;
    private boolean check = false;
    public User(String name) {
        this.name = name;
    }
    public void Vote(UngVien ungVien){
        Election election = Election.Instance();
        check = true;
        election.Vote(ungVien, this);
    }
}
