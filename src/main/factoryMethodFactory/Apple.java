package main.factoryMethodFactory;

public class Apple implements Computer{
    @Override
    public void create() {
        System.out.println("Apple 电脑");
    }
}
