package main.abstractFactory;

public interface Factory {
    IKeyboard keyboardFactory();
    IMouse mouseFactory();
}
