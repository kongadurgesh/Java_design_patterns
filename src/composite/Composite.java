package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        components.stream().forEach((component) -> component.showPrice());
    }

    public void addComponent(Component component) {
        components.add(component);
    }

}
