package abstractfactory;

public class UIFactoryApplication {
    private Button button;
    private CheckBox checkBox;

    public UIFactoryApplication() {
    }

    public UIFactoryApplication(UIFactory uiFactory) {
        this.button = uiFactory.createButton();
        this.checkBox = uiFactory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
