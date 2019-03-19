package main.abstractFactory;

public class DellKeyboard implements IKeyboard  {
    @Override
    public void createIKeyboard() {
        System.out.println("Dell keyboard");
    }
}
