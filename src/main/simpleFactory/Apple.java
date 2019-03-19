package main.simpleFactory;

public class Apple implements Computer {
    @Override
    public void create() {
        System.out.println("Apple 电脑正在生产... ...");
    }
}
