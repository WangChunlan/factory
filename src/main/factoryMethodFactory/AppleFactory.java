package main.factoryMethodFactory;

public class AppleFactory implements Factory {
    @Override
    public Computer createProduct() {
        return new Apple();
    }
}
