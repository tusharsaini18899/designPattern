package structural.facade;

public class ZomatoFacade {
    Restaurant restaurant;
    DeliveryTeam deliveryTeam;
    DeliveryBoy deliveryBoy;

    public ZomatoFacade(){
        this.restaurant=new Restaurant();
        this.deliveryBoy=new DeliveryBoy();
        this.deliveryTeam=new DeliveryTeam();
    }

    public void placeOrder() {
        restaurant.prepareOrder();
        deliveryTeam.assignDeliveryBoy();
        deliveryBoy.pickupOrder();
        deliveryBoy.deliverOrder();
    }
}
