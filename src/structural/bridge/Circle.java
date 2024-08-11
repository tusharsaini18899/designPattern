package structural.bridge;

public class Circle extends Shape {
    String color;
    public Circle(Color color) {
        super(color);
        this.color=color.getColor();
    }

    @Override
    public void getShape() {
        System.out.println(color+" Circle");
    }
}
