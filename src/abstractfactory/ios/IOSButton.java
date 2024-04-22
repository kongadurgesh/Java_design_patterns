package abstractfactory.ios;

import abstractfactory.Button;

public class IOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("IOS Button is created");
    }

}
