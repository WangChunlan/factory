package main.abstractFactory;

public class AppleFactory implements Factory {
    @Override
    public IKeyboard keyboardFactory() {
        return new AppleKeyboard();
    }

    @Override
    public IMouse mouseFactory() {
        return new AppleMouse();
    }
}
