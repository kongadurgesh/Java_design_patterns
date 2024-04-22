package decorator;

public class Basepizza implements Pizza {

    @Override
    public String bake() {
        return "Base Pizza";
    }

}
