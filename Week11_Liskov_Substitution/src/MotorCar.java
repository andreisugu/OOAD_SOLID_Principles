public class MotorCar implements EngineCar {

    private Engine engine;

    public MotorCar(Engine engine) {
        this.engine = engine;
    }

    //Constructors, getters + setters

    public void turnOnEngine() {
        //turn on the engine!
        engine.on();
    }

    public void accelerate() {
        //move forward!
        engine.powerOn(1000);
    }
}
