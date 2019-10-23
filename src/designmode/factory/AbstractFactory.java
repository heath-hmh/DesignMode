package designmode.factory;

/**
 * @author Heath
 * @date 2019/10/22
 * 抽象工厂
 */
public interface AbstractFactory {
    //抽象产品（Product）
    void abstractFactoryMethod();

    //具体产品（ConcreteProduct）
    AbstractFactory createObjectMethod();

}
