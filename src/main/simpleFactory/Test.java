package main.simpleFactory;

/**
 * 简单工厂模式：根据传入的参数，由工厂对象动态决定生成哪一种产品实例。 但不属于23种设计模式
 * 适用场景：工厂类负责创建的对象较少的场景，且客户端只需要传入工厂类的参数，对于创建对象的逻辑不关心。
 * 缺点：工厂类职责过重，不易于扩展过于复杂的产品结构
 */
public class Test {
    public static void main(String[] args) {
//        methodOne();
//        methodTwo();
        methodThree();

    }

    public static void methodOne() {
        SimpleFactory factory = new SimpleFactory();
        factory.createOne("dell").create();
    }

    public static void methodTwo() {
        SimpleFactory factory = new SimpleFactory();
        factory.createTwo("main.simpleFactory.Dell").create();
    }

    public static void methodThree() {
        SimpleFactory factory = new SimpleFactory();
        factory.createThree(Dell.class).create();
    }
}
