import behavioural.ChainOfResponsibility.logging.Logging;
import behavioural.CommandPattern.CommandPatternDriver;
import behavioural.Iterator.iteratorClient;
import behavioural.Mediator.Platform;
import behavioural.NullObject.ConditionalFactoryNullObj;
import behavioural.NullObject.ProductWithNullObj;
import behavioural.State.BoxPackage;
import behavioural.Templet.TempletDriver;
import behavioural.momento.GitUser;
import creational.AbstractFactory.Client;
import creational.Builder.Director;
import creational.Factory.ConditionalFactory;
import creational.Factory.Product;
import creational.Prototype.Driver;
import structural.Adapter.OldAdaptee;
import structural.Composite.CompositePatternDriver;
import structural.Decorator.Coffee;
import structural.Decorator.LatteCoffee;
import structural.Decorator.Milk;
import structural.Decorator.Sugar;
import behavioural.Behavioural;
import behavioural.Observer.ObserverClient;
import behavioural.Strategy.Strategy;
import creational.Creational;
import creational.singleton.Singleton;
import structural.Facade.DTO.EmployeeDTO;
import structural.Flyweight.UserInterface;
import structural.Proxy.MB;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Main");
        Creational singleton = new Singleton();
        Behavioural strategy = new Strategy();
        Behavioural oberver= new ObserverClient();
        System.out.println("*********** Decorator patter ************");
        Coffee latte = new Milk(new Sugar(new LatteCoffee()));
        System.out.println("Description  : "+latte.getDescription());
        System.out.println("price : "+ latte.getCost());

        System.out.println("*********** Chain of responsibilities ************");
        Logging l=new Logging();
        CommandPatternDriver commandPatternDriver=new CommandPatternDriver();
        TempletDriver templetDriver=new TempletDriver();
        GitUser mementoGit = new GitUser();
        Platform platform = new Platform();
        System.out.println("*********** Builder ************");
        Director director= new Director();

        System.out.println("*********** prototype ************");
        Driver driver = new Driver();

        System.out.println("*********** composite ************");
        CompositePatternDriver compositePatternDriver= new CompositePatternDriver();

        System.out.println("*********** Adapter design pattern ************");
        OldAdaptee oldAdaptee = new OldAdaptee("MP4");
        oldAdaptee.playMusic();

        System.out.println("***********facade ************");
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.create("pranavi", "1");
        employeeDTO.getMeIn();


        System.out.println("*********** Proxy ************");

        MB mb = new MB();
        mb.callTekion();

        System.out.println("*********** Flyweight ************");
        UserInterface userInterface = new UserInterface();

        System.out.println("*********** Factory method ************");
        Product factory=new ConditionalFactory().getProduct("MAKEUP");
        factory.display();

        System.out.println("*********** Abstract Factory method ************");
        Client client = new Client();


        System.out.println("*********** Iterator ************");
        iteratorClient iteratorClient=new iteratorClient();


        System.out.println("*********** Iterator ************");
        ProductWithNullObj nullObjCond=new ConditionalFactoryNullObj().getProduct("Phone");
        nullObjCond.display();

        System.out.println("*********** state ************");
        BoxPackage boxPackage = new BoxPackage();
        boxPackage.printStatus();
        boxPackage.next();
        boxPackage.printStatus();
        boxPackage.next();
        boxPackage.printStatus();
        boxPackage.next();
        boxPackage.printStatus();




    }
}