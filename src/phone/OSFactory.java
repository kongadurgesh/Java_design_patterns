package phone;

public class OSFactory {
    public OS getInstance(String type) {
        if (type == "Open")
            return new Android();
        else if (type == "Closed")
            return new IOS();
        else
            return new Windows();
    }
}
