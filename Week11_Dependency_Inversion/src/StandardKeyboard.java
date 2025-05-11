// StandardKeyboard.java
public class StandardKeyboard implements Keyboard {
    @Override
    public void type(String input) {
        System.out.println("Typing on Standard Keyboard: " + input);
    }
}