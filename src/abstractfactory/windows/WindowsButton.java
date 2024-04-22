package abstractfactory.windows;

import abstractfactory.Button;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Windows Button is created");
    }

}
