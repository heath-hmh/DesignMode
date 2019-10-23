package designmode.abstractfactory;

import designmode.utils.PrintlnUtils;

public class AbstractFactory2Imp implements AbstractFactory.AbstractFactory2 {
    private static final String TAG = AbstractFactory2Imp.class.getSimpleName();
    @Override
    public void show() {
        PrintlnUtils.println(TAG+"调用了show方法");
    }
}
