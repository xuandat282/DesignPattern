package behavioral.template_method.qlsv;

import java.util.ArrayList;
import java.util.List;

public abstract class QLData<T> {
    List<T> list = new ArrayList<>();

    abstract protected int khoa(T t);
    abstract public void hienThiDoiTuong(T t);
    // kiem tra 1 doi tuong t co trong list hay ko
    public boolean kiemTra(T t){
        for (T o:list){
            if(khoa(o)==khoa(t))
                return true;
        }
        return false;
    }

    public boolean them(T t){
        if (!kiemTra(t)){
            list.add(t);
            return true;
        }
        return false;
    }

    public int capNhat(T t){
        for (int i = 0; i< list.size(); i++ ){
            if(khoa(t)==khoa(list.get(i))){
                list.set(i, t);
                return 1;
            }
        }
        return 0;
    }
    public int xoa(T t){
        for (int i = 0; i< list.size(); i++ ){
            if(khoa(t)==khoa(list.get(i))){
                list.remove(i);
                return 1;
            }
        }
        return 0;
    }
    public void hienThi(){
        list.forEach(t -> {
            hienThiDoiTuong(t);
            System.out.println();
        });
    }
}

