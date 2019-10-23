package designmode.builder;

import designmode.utils.PrintlnUtils;

/**
 * @author Heath
 * @date 2019/10/22
 * 建造者模式：指将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示，这样的设计模式被称为建造者模式。
 * <p>
 * 1.编写主题class
 * 2.构建builder，通过builder配置参数
 * </p>
 */
public class BuilderTest {
    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilder.Builder()
                .installMainBoard("华硕z390-p")
                .installCpu("i7 9700散")
                .installPowerSupply("电源雷霆二500W")
                .installMemoryBank("金斯顿Ddr4 8G x2")
                .installGraphicsCard("影驰Gtx2060 6G大将")
                .installHardDisk("三星Ssd500G/970plus固态")
                .installRadiator("玄冰400单风扇散热器")
                .installCrate("毁灭战将机箱")
                .installDisplay("飞利浦2k曲面显示器")
                .installKeyBoard("ET机械键盘")
                .installMouse("达尔优鼠标")
                .installComputerDesk("电脑桌")
                .installComputerChair("傲风电竞椅")
                .builder();
        PrintlnUtils.println(builder);

        ComputerBuilder builder2 = new ComputerBuilder.Builder()
                .installMainBoard("华硕z390-")
                .installCpu("i7 9700")
                .installPowerSupply("电源雷霆500W")
                .installMemoryBank("金斯顿Ddr4 8G")
                .installGraphicsCard("影驰Gtx2060 6G")
                .installHardDisk("三星Ssd500G/970plus")
                .installRadiator("玄冰4004单风扇散热器")
                .installCrate("毁灭战将机箱s")
                .installDisplay("飞利浦4k曲面显示器")
                .installKeyBoard("ETT机械键盘")
                .installMouse("达尔优鼠标s")
                .installComputerDesk("电脑桌s")
                .installComputerChair("傲风电竞椅s")
                .builder();
        PrintlnUtils.println(builder2);
    }
}
