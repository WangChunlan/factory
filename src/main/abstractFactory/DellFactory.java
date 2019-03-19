package main.abstractFactory;

public class DellFactory implements Factory {
    @Override
    public IKeyboard keyboardFactory() {
        return new DellKeyboard();
    }

    @Override
    public IMouse mouseFactory() {
        return new DellMouse();
    }
}
