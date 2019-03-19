package main.factoryMethodFactory;

public class Dell implements Computer {
    @Override
    public void create() {
        System.out.println("Dell 电脑");
    }
}
