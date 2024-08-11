package structural.bridge;

public class Square extends Shape {
    String color;
    public Square(Color color) {
        super(color);
        this.color=color.getColor();
    }

    @Override
    public void getShape() {
        System.out.println(color+" Square");
    }
}
