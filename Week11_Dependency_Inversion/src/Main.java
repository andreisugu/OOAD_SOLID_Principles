public class Main {
    public static void main(String[] args) {
        Keyboard keyboard = new StandardKeyboard();
        Monitor monitor = new Monitor();
        Keyboard gamingkey = new GamingKeyboard();
        Windows98Machine machine = new Windows98Machine(gamingkey, monitor);

        machine.boot();
        machine.use();
    }
}