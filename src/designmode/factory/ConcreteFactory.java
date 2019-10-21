package designmode.factory;

import designmode.utils.PrintlnUtils;

public class ConcreteFactory implements AbstractFactory {

    @Override
    public void abstractFactoryMethod() {
        PrintlnUtils.println("调用了abstractFactoryMethod方法");
    }

    @Override
    public AbstractFactory createObjectMethod() {
        PrintlnUtils.println("调用了createObjectMethod方法");
        return new ConcreteFactory();
    }
}
