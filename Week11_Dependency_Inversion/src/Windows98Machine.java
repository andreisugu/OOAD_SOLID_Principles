// Windows98Machine.java
public class Windows98Machine {

    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    public void boot() {
        System.out.println("Windows 98 is booting up...");
        monitor.display("Welcome to Windows 98!");
    }

    public void use() {
        keyboard.type("Hello World!");
        monitor.display("Opening Notepad...");
        keyboard.type("This is a test document.");
        monitor.display("Saving file...");
    }
}