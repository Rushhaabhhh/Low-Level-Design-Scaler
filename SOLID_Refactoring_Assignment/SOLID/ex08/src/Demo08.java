public class Demo08 {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle();
        Car car = new Car();
        ElectricCar eCar = new ElectricCar();

        usePedal(bike);
        
        useDrive(car);
        useDrive(eCar);
    
        useRecharge(eCar);
    }
    
    static void usePedal(Pedal vehicle) {
        vehicle.pedal(3);
    }
    
    static void useDrive(StartEngine vehicle) {
        vehicle.StartEngine();
    }
    
    static void useRecharge(Recharge vehicle) {
        vehicle.recharge(50);
    }
}
