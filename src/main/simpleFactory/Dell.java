package main.simpleFactory;

public class Dell implements Computer {
    @Override
    public void create() {
        System.out.println("Dell 电脑正在生产... ...");
    }
}
