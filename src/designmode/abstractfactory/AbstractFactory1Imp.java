package designmode.abstractfactory;

import designmode.utils.PrintlnUtils;

public class AbstractFactory1Imp implements AbstractFactory.AbstractFactory1 {
    private static final String TAG = AbstractFactory1Imp.class.getSimpleName();

    @Override
    public void show() {
        PrintlnUtils.println(TAG + "调用了show方法");
    }
}
