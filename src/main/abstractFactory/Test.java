package main.abstractFactory;

public class Test {
    public static void main(String[] args) {
        AppleFactory factory=new AppleFactory();
        IKeyboard keyboard=factory.keyboardFactory();
        keyboard.createIKeyboard();

        IMouse mouse=factory.mouseFactory();
        mouse.createIMouse();

    }
}
