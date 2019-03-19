package main.factoryMethodFactory;

/**
 * 工厂方法模式:
 * 指定一个创建对象的接口，但让实现这个接口的类来决定实例化那个类，工厂方法让类的实例化推迟到子类中进行。
 * 适用场景：
 * 1、创建对象需要大量重复代码
 * 2、客户端不关心于产品类实例如何被实例化细节。
 * 3、一个类通过其子类来指定创建那个对象
 *
 * 缺点：
 * 1、类的个数容易多，增加了复杂度
 * 2、增加了系统的抽象性和理解难度
 */
public class Test {
    public static void main(String[] args) {
        DellFactory factory=new DellFactory();
        factory.createProduct().create();
    }
}
