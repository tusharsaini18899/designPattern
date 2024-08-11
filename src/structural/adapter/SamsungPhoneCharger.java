package structural.adapter;

public class SamsungPhoneCharger implements AndroidCharger{
    @Override
    public void chargePhone() {
        System.out.println("Charging By Samsung Phone charger.......");
    }
}
