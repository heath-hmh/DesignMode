package designmode.factory;

import designmode.utils.PrintlnUtils;

/**
 * @author Heath
 * @date 2019/10/22
 * 具体工厂（ConcreteFactory）
 */
public class ConcreteFactory2 implements AbstractFactory {
    public static final String TAG = ConcreteFactory2.class.getSimpleName();

    @Override
    public void abstractFactoryMethod() {
        PrintlnUtils.println(TAG + "调用了abstractFactoryMethod方法");
    }

    @Override
    public AbstractFactory createObjectMethod() {
        PrintlnUtils.println(TAG + "调用了createObjectMethod方法");
        return new ConcreteFactory2();
    }
}
