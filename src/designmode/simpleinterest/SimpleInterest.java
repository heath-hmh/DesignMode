package designmode.simpleinterest;

/**
 * @author Heath
 * @date 2019-10-21
 * 单利对象：指一个类只有一个实例，且该类能自行创建这个实例的一种模式。
 * <p>
 * 1.私有化构造函数
 * 2.对外提供一个公共的、静态的、返回值为本类对象的方法
 * </p>
 *
 * <p>
 * 单利对象的写法：
 * 1.饿汉式 ---- 一上来就创建对象了，如果该实例从始至终都没被使用过，则会造成内存浪费。
 * 2.懒汉式 ---- 用到的时候再创建对象。[常用]
 * </p>
 */
public class SimpleInterest {
    //懒汉式
    private static SimpleInterest simpleInterest;
    //饿汉式
//    private static SimpleInterest simpleInterest = new SimpleInterest();

    private SimpleInterest() {

    }

    //懒汉式
    public static SimpleInterest getInstance() {
        //提升性能
        if (simpleInterest == null) {
            //防止多线程操作创建多个对象
            synchronized (SimpleInterest.class) {
                //判读对象是否为null
                if (simpleInterest == null) {
                    simpleInterest = new SimpleInterest();
                }
            }
        }
        return simpleInterest;
    }

    /* 饿汉式
    public static SimpleInterest getInstance() {
        return simpleInterest;
    }
    */
}
