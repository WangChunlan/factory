package main.abstractFactory;

public class AppleKeyboard implements IKeyboard {
    @Override
    public void createIKeyboard() {
        System.out.println("Apple keyboard");
    }
}
