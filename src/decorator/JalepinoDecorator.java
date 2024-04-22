package decorator;

public class JalepinoDecorator extends PizzaDecorator {

    public JalepinoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return super.bake() + addJalepino();
    }

    public String addJalepino() {
        return "jalepino";
    }

}
