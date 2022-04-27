package creational.bt4;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election instance;
    private int DonaldTrump = 0;
    private int JoeBiden = 0;
    List<String> users = new ArrayList<>();
    public static Election Instance(){
        if (instance == null) instance = new Election();
        return instance;
    }
    public void Vote(UngVien ungVien, User user){
        if(users.contains(user.name)){
            return;
        }
        if (ungVien == null)
            return;
        else {
            if (ungVien == UngVien.DonaldTrump) {
                DonaldTrump++;
                users.add(user.name);
            } else if (ungVien == UngVien.JoeBiden) {
                JoeBiden++;
                users.add(user.name);
            }
        }
    }
    public int getDonaldTrump() {
        return DonaldTrump;
    }
    public int getJoeBiden() {
        return JoeBiden;
    }
}
