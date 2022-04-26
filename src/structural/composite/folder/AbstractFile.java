package structural.composite.folder;

public abstract class AbtractFile {
    String ten, path;
    String ngay;
    String preStr = "";

    public AbstractFile(String ten, String ngay) {
        this.ten = ten;
        this.path = ten;
        this.ngay = ngay;
    }

    public abstract String getStringTreeFolder();
    public String getPath(){
        return path;
    }
    public abstract void addItem(AbstractFile abstractFile);
    public abstract void removeItem(AbstractFile abstractFile);

}
