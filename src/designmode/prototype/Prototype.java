package designmode.prototype;

import designmode.utils.PrintlnUtils;

/**
 * @author Heath
 * @date 2019-10-21
 * 原型模式：
 * 用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。
 * 在这里，原型实例指定了要创建的对象的种类。用这种方式创建对象非常高效，根本无须知道对象创建的细节。
 * <p>
 * 1.要克隆的class实现Cloneable接口
 * 2.重写Object的clone方法实现内容
 * </p>
 * <p>
 * 1.浅克隆 ---- 直接将已有对象赋值给新的对象。 修改clone后的对象值也会同时修改克隆前的值
 * 2.深克隆 ---- 利用Object提空有clone方法。[常用]
 * </p>
 */
public class Prototype {

    /**
     * 浅克隆
     */
    private static void shallowClone() {
        PrototypeEntity prototypeEntity = new PrototypeEntity(1, "1");
        PrototypeEntity clonePrototypeEntity = prototypeEntity;
        clonePrototypeEntity.a = 2;
        clonePrototypeEntity.b = "2";
        prototypeEntity.println("PrototypeEntity");
        clonePrototypeEntity.println("ClonePrototypeEntity");
    }

    private static void deepClone() {
        PrototypeEntity prototypeEntity = new PrototypeEntity(1, "1");
        PrototypeEntity clonePrototypeEntity = prototypeEntity.clone();
        clonePrototypeEntity.a = 2;
        clonePrototypeEntity.b = "2";
        prototypeEntity.println("PrototypeEntity");
        clonePrototypeEntity.println("ClonePrototypeEntity");
    }

    public static void main(String[] args) {
        shallowClone();
        PrintlnUtils.println("-------------------");
        deepClone();
    }
}
