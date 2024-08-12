package structural;

import structural.adapter.Adapter;
import structural.adapter.Iphone15Charger;
import structural.adapter.IphoneCharge;
import structural.adapter.SamsungPhoneCharger;
import structural.bridge.*;
import structural.composite.Department;
import structural.composite.FinanceDepartment;
import structural.composite.HeadDepartment;
import structural.composite.LibraryDepartment;
import structural.decorator.Rectangle;
import structural.decorator.RedShapeDecorator;
import structural.facade.ZomatoFacade;
import structural.flyWeight.Icon;
import structural.flyWeight.IconFactory;
import structural.proxy.ATM;

public class StructuralMain {
    public static void main(String[] args) {

        // structural.adapter design charging iphone15 by android charger using adaptor
        // allows objects with incompatible interfaces to collaborate. worked as a translator middleware
        // An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly.
        System.out.println("********************  Adapter Start  *************************");
        IphoneCharge iphoneCharge = new Adapter(new SamsungPhoneCharger());
        Iphone15Charger iphone15 = new Iphone15Charger(iphoneCharge);
        iphone15.chargePhone();
        System.out.print("\n\n");


        // structural.bridge design pattern -> split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.
        // The Bridge pattern lets you split the monolithic class into several class hierarchies
        // Use the Bridge if you need to be able to switch implementations at runtime.
        System.out.println("********************  Bridge Start  *************************");
        Shape circle = new Circle(new RedColor());
        circle.getShape();
        Shape square = new Square(new BlueColor());
        square.getShape();
        System.out.print("\n\n");


        // structural.composite design pattern
        // finance and library inside department and in headDepartment and these 3 will be in department
        // Use the Composite pattern when you have to implement a tree-like object structure.
        System.out.println("********************  Composite Start  *************************");
        Department finance = new FinanceDepartment();
        Department library = new LibraryDepartment();
        HeadDepartment headDepartment = new HeadDepartment();
        headDepartment.addDepartment(finance);
        headDepartment.addDepartment(library);
        headDepartment.getDepartmentName();
        System.out.print("\n\n");


//        //structural.decorator
        // Use the Decorator pattern when you need to be able to assign extra behaviors to objects at runtime without breaking the code that uses these objects.
        System.out.println("********************  Decorator Start  *************************");
        RedShapeDecorator redColorRectangle = new RedShapeDecorator(new Rectangle());
        redColorRectangle.draw();
        RedShapeDecorator redColorCircle = new RedShapeDecorator(new structural.decorator.Circle());
        redColorCircle.draw();
        System.out.print("\n\n");


        // structural.facade as a mediator
        // Facade pattern hides the complexities of the system and provides an interface to the client
        System.out.println("********************  Facade Start  *************************");
        ZomatoFacade zomatoFacade = new ZomatoFacade();
        zomatoFacade.placeOrder();
        System.out.print("\n\n");


        //structural.fly weight
        // a structural pattern that focuses on optimizing memory usage by sharing a common state among multiple objects.
        // Use the Flyweight pattern only when your program must support a huge number of objects which barely fit into available RAM.
        System.out.println("********************  Flyweight Start  *************************");
        IconFactory iconFactory = new IconFactory();
        Icon fileIcon = iconFactory.getIcon("file");
        fileIcon.draw(10, 15);
        Icon folderIcon = iconFactory.getIcon("folder");
        folderIcon.draw(25, 45);
        System.out.print("\n\n");

        // structural.proxy design pattern
        //A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.
        System.out.println("********************  Proxy Start  *************************");
        ATM atm = new ATM();
        atm.withdraw();
    }
}
