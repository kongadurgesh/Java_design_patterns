package facade;

public class Zomato {
    private Restaurant restaurant;
    private DeliveryBoy deliveryBoy;
    private DeliveryTeam deliveryTeam;

    public Zomato() {
        this.restaurant = new Restaurant();
        this.deliveryBoy = new DeliveryBoy();
        this.deliveryTeam = new DeliveryTeam();
    }

    public void placeOrder() {
        restaurant.prepareOrder();
        deliveryTeam.assignDeliveryboy();
        deliveryBoy.pickUpOrder();
        deliveryBoy.delieverOrder();
    }
}
