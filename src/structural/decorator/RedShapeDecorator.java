package structural.decorator;

public class RedShapeDecorator extends ShapeDecorator {

    Shape shape;

    public RedShapeDecorator(Shape shapeDecorator) {
        super(shapeDecorator);
        this.shape=shapeDecorator;
    }

    @Override
    public void draw() {
        setRedBorder(shape);
        shape.draw();
    }

    private void setRedBorder(Shape redBorder) {
        System.out.print("Red Border ");
    }
}
