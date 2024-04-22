import abstractfactory.UIFactoryApplication;
import abstractfactory.ios.IOSUIFactory;
import adapter.AssignmentWork;
import adapter.Pen;
import adapter.PenAdapter;
import bridge.HDProcesssor;
import bridge.K4Processor;
import bridge.NetflixVideo;
import bridge.YoutubeVideo;
import builder.Phone;
import builder.PhoneBuilder;
import chain_of_responsibilities.BankPaymentHandler;
import chain_of_responsibilities.CreditCardPaymentHandler;
import chain_of_responsibilities.PaymentHandler;
import chain_of_responsibilities.PaypalPaymentHandler;
import composite.Component;
import composite.Composite;
import composite.Leaf;
import decorator.Basepizza;
import decorator.CheeseBurstDecorator;
import decorator.JalepinoDecorator;
import decorator.Pizza;
import facade.Zomato;
import memento.CareTaker;
import memento.Originator;
import observer.Channel;
import observer.Subscriber;
import phone.OS;
import phone.OSFactory;
import prototype.BookShop;
import proxy.ATM;
import singleton.Singleton;
import strategy.Context;
import strategy.OperationAdd;
import strategy.OperationSubtract;
import template.BeverageMaker;
import template.TeaMaker;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {

        // Example for Singleton Pattern
        Singleton.getInstance();
        Singleton.sayHello();

        // Example for Builder Pattern
        Phone phone = new PhoneBuilder()
                .setBattery(5000)
                .setOs("Android 13")
                .setProcessor("Qualcomm")
                .setRam(8)
                .setScreenSize(6)
                .getPhone();
        System.out.println(phone.toString());

        // Example for Prototype pattern
        BookShop bookShop = new BookShop();
        bookShop.setShopId("123");
        bookShop.loadData();

        // BookShop bookShop2 = (BookShop) bookShop.clone();
        bookShop.getBooks().remove(0);
        System.out.println(bookShop.toString());
        // System.out.println(bookShop2.toString());

        // Example for Factory Pattern
        OSFactory osFactory = new OSFactory();
        OS os = osFactory.getInstance("ok");
        os.getSpecifications();

        // Example for Abstract Factory Pattern
        UIFactoryApplication uiFactoryApplication = new UIFactoryApplication(new IOSUIFactory());
        uiFactoryApplication.paint();

        // Example for Adapter Pattern
        AssignmentWork assignmentWork = new AssignmentWork();
        Pen pen = new PenAdapter();
        assignmentWork.setP(pen);
        assignmentWork.writeAssigment("Test");

        // Example for Bridge Pattern
        YoutubeVideo youtubeVideo = new YoutubeVideo(new HDProcesssor());
        youtubeVideo.play("play file");

        NetflixVideo netflixVideo = new NetflixVideo(new K4Processor());
        netflixVideo.play("netflix play file");

        // Example for Composite Pattern
        Component hardDrive = new Leaf(100, "hdd");
        Component mouse = new Leaf(200, "Mouse");
        Component monitor = new Leaf(300, "Monitor");
        Component ram = new Leaf(400, "RAM");
        Component cpu = new Leaf(500, "CPU");

        Composite peripherals = new Composite("Peripherals");
        Composite motherBoard = new Composite("motherBoard");
        Composite cabinet = new Composite("cabinet");
        Composite computer = new Composite("computer");

        peripherals.addComponent(mouse);
        peripherals.addComponent(monitor);
        motherBoard.addComponent(ram);
        motherBoard.addComponent(cpu);
        cabinet.addComponent(hardDrive);
        cabinet.addComponent(motherBoard);

        computer.addComponent(cabinet);
        computer.addComponent(peripherals);

        computer.showPrice();

        // Example for Decorator Pattern
        Pizza pizza = new JalepinoDecorator(new CheeseBurstDecorator(new Basepizza()));
        System.out.println(pizza.bake());

        // Example for Facade pattern
        Zomato zomatoApp = new Zomato();
        zomatoApp.placeOrder();

        // Example for Proxy Pattern
        ATM account = new ATM();
        account.withdraw(100);

        // Example for Observer Pattern
        Channel channel = new Channel();
        Subscriber subscriber1 = new Subscriber("A");
        Subscriber subscriber2 = new Subscriber("B");
        Subscriber subscriber3 = new Subscriber("C");
        Subscriber subscriber5 = new Subscriber("D");
        Subscriber subscriber4 = new Subscriber("E");

        channel.subscribe(subscriber5);
        channel.subscribe(subscriber4);
        channel.subscribe(subscriber3);
        channel.subscribe(subscriber2);
        channel.subscribe(subscriber1);

        channel.upload("New Video");

        // Example for Chain of Responsibilities
        PaymentHandler bank = new BankPaymentHandler();
        PaymentHandler creditCard = new CreditCardPaymentHandler();
        PaymentHandler paypal = new PaypalPaymentHandler();
        bank.setNext(creditCard);
        creditCard.setNext(paypal);

        bank.handlePayment(500);
        bank.handlePayment(300);
        bank.handlePayment(1200);
        bank.handlePayment(700);

        // Example for State Pattern
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStatetoMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStatetoMemento());

        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());

        // Example for Strategy Pattern
        Context addContext = new Context(new OperationAdd());
        System.out.println(addContext.executeStrategy(1, 2));
        Context subtractContext = new Context(new OperationSubtract());
        System.out.println(subtractContext.executeStrategy(123, 12));

        // Example for Template Pattern
        BeverageMaker teaMaker = new TeaMaker();
        teaMaker.makeBeverage();
    }
}
