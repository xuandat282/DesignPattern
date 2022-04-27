package structural.composite.folder;

public class Main {
    public static void main(String[] args){
        AbstractFile abstractFile = new Folder("kiet","30");
        AbstractFile abstractFile2 = new Folder("kietNho","31/1/2001");
        AbstractFile abstractFile3 = new Folder("kietnhonho","123");

        AbstractFile file = new File("kietimg","30/20");
        AbstractFile file2 = new File("kietnhoimg","11");

        abstractFile.addItem(abstractFile2);
        abstractFile2.addItem(abstractFile3);

        abstractFile.addItem(file);
        abstractFile2.addItem(file2);

        System.out.println(abstractFile.getStringTreeFolder());
    }
}
