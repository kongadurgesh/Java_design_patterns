package abstractfactory.ios;

import abstractfactory.Button;
import abstractfactory.CheckBox;
import abstractfactory.UIFactory;

public class IOSUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new IOSCheckBox();
    }

}
