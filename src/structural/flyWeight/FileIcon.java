package structural.flyWeight;

public class FileIcon implements Icon {

    private String fileName;
    private String type;

    public FileIcon(String type, String fileName) {
        this.fileName = fileName;
        this.type = type;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("draw " + type + " with file name " + fileName + " at position (" + x + "," + y + ")");
    }
}
