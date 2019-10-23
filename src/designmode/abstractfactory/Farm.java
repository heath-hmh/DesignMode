package designmode.abstractfactory;

public class Farm implements AbstractFactory {

    @Override
    public AbstractFactory1 createAbstractFactory1() {
        return new AbstractFactory1Imp();
    }

    @Override
    public AbstractFactory2 createAbstractFactory2() {
        return new AbstractFactory2Imp();
    }
}
