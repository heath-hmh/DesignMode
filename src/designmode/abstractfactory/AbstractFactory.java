package designmode.abstractfactory;

public interface AbstractFactory {
    interface AbstractFactory1 {
        void show();
    }

    interface AbstractFactory2 {
        void show();
    }

    AbstractFactory1 createAbstractFactory1();

    AbstractFactory2 createAbstractFactory2();
}
