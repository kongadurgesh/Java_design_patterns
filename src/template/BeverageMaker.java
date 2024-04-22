package template;

public abstract class BeverageMaker {
    public final void makeBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    public void boilWater() {
        System.out.println("Boiling Water");
    }

    private void pourInCup() {
        System.out.println("Pouring in Cup");
    }
}
