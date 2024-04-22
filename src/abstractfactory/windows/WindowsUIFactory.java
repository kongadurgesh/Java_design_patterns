package abstractfactory.windows;

import abstractfactory.Button;
import abstractfactory.CheckBox;
import abstractfactory.UIFactory;

public class WindowsUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }

}
