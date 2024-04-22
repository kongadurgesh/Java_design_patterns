package template;

public class TeaMaker extends BeverageMaker {

    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the Tea");
    }

}
