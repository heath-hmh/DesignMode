package designmode.factory;

/**
 * @author Heath
 * @date 2019-10-21
 * 工厂模式：定义一个创建产品对象的工厂接口，将产品对象的实际创建工作推迟到具体子工厂类当中。
 * <p>
 * 工厂方法模式由抽象工厂、具体工厂、抽象产品和具体产品等4个要素构成。本节来分析其基本结构和实现方法。
 * 抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法来创建产品。
 * 具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。
 * 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能。
 * 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。
 * </p>
 *
 * <p>
 * 1.编写工厂接口
 * 2.实现工厂接口，实现具体方法
 * </p>
 */
public class FactoryTest {
    public static void main(String[] args) {
        ConcreteFactory concreteFactory = new ConcreteFactory();
        concreteFactory.abstractFactoryMethod();
        AbstractFactory objectMethod = concreteFactory.createObjectMethod();
        objectMethod.abstractFactoryMethod();

        ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();
        concreteFactory2.abstractFactoryMethod();
        AbstractFactory objectMethod1 = concreteFactory2.createObjectMethod();
        objectMethod1.abstractFactoryMethod();
    }
}
