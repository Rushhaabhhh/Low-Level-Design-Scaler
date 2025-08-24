public class ElectricCar implements StartEngine, Recharge {

    @Override
    public void recharge(int kWh) {
        System.out.println("Charging with " + kWh + " kWh");
    }

    @Override
    public void StartEngine() {
        System.out.println("Electric engine started !");
    }
    
}
