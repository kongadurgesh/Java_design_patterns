package observer;

public class Subscriber {
    private String name;
    private Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println("hey " + name + ", Video Uploaded");
    }

    public void subscribe(Channel channel) {
        this.channel = channel;
    }

    public Channel getChannel() {
        return channel;
    }

}
