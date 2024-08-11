package structural.flyWeight;

public class FolderIcon implements Icon {
    public String type;
    public String fileName;

    public FolderIcon(String type, String fileName) {
        this.type = type;
        this.fileName = fileName;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("draw " + type + " with file name " + fileName + " at position (" + x + "," + y + ")");
    }
}
