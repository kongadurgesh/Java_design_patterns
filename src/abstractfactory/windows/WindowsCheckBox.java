package abstractfactory.windows;

import abstractfactory.CheckBox;

public class WindowsCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("Windows Checkbox is created");
    }

}
