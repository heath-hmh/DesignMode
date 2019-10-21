package designmode.prototype;

import designmode.utils.PrintlnUtils;

public  class PrototypeEntity implements Cloneable {

    public int a;
    public String b;

    public PrototypeEntity(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public PrototypeEntity() {

    }

    //深克隆
    @Override
    protected PrototypeEntity clone() {
        PrototypeEntity prototypeEntity;
        try {
            prototypeEntity = (PrototypeEntity) super.clone();
            return prototypeEntity;
        } catch (CloneNotSupportedException e) {
            prototypeEntity = new PrototypeEntity();
            e.printStackTrace();
            PrintlnUtils.println("克隆对象失败");
        }
        return prototypeEntity;
    }

    @Override
    public String toString() {
        return "{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }

    public void println(String tag) {
        System.out.println(tag + toString());
    }
}

