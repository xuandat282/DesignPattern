package structural.composite.folder;

import java.util.Date;

public class File extends AbstractFile{

    public File(String ten, String ngay) {
        super(ten, ngay);
    }

    @Override
    public String getStringTreeFolder() {
        return this.ten;
    }

    @Override
    public void addItem(AbstractFile abstractFile) {
    }

    @Override
    public void removeItem(AbstractFile abstractFile) {
    }
}
