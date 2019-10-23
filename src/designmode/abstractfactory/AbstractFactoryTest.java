package designmode.abstractfactory;

/**
 * @author Heath
 * @date 2019/10/22
 * 抽象工厂：一种为访问类提供一个创建一组相关或相互依赖对象的接口，且访问类无须指定所要产品的具体类就能得到同族的不同等级的产品的模式结构。
 * <p>
 * 1.编写抽象工厂接口。
 * 2.具体工厂实现接口实现实现具体的方法。
 * </p>
 * <p>
 * 使用抽象工厂模式一般要满足以下条件：
 * 1.系统中有多个产品族，每个具体工厂创建同一族但属于不同等级结构的产品。
 * 2.系统一次只可能消费其中某一族产品，即同族的产品一起使用。
 * </p>
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new Farm();
        AbstractFactory.AbstractFactory1 abstractFactory1 = abstractFactory.createAbstractFactory1();
        AbstractFactory.AbstractFactory2 abstractFactory2 = abstractFactory.createAbstractFactory2();
        abstractFactory1.show();
        abstractFactory2.show();
    }
}
