package structural.adapter;

public class Iphone15Charger implements IphoneCharge {

    IphoneCharge iphoneCharge;

    public Iphone15Charger(IphoneCharge iphoneCharge) {
        this.iphoneCharge = iphoneCharge;
    }

    @Override
    public void chargePhone() {
        iphoneCharge.chargePhone();
    }
}
