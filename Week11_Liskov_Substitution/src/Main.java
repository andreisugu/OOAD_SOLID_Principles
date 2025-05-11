public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        EngineCar motorCar = new MotorCar(engine);
        motorCar.turnOnEngine();
        motorCar.accelerate();

        Car electricCar = new ElectricCar();
        electricCar.accelerate();
    }
}