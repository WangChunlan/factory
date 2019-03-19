package main.factoryMethodFactory;

public class DellFactory implements Factory {
    @Override
    public Computer createProduct() {
        return new Dell();
    }
}
