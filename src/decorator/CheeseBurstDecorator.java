package decorator;

public class CheeseBurstDecorator extends PizzaDecorator {

    public CheeseBurstDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return super.bake() + addCheeseBurst();
    }

    private String addCheeseBurst() {
        return "Cheese Burst";
    }

}
