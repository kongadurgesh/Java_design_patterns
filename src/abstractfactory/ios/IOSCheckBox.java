package abstractfactory.ios;

import abstractfactory.CheckBox;

public class IOSCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("IOS CheckBox is created");
    }

}
