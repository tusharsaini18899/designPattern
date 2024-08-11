package structural.adapter;

public class Adapter implements IphoneCharge{

    AndroidCharger androidCharger;

    public Adapter(AndroidCharger androidCharger){
        this.androidCharger=androidCharger;
    }
    @Override
    public void chargePhone() {
        androidCharger.chargePhone();
    }
}
