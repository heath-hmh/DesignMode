package designmode.builder;

import designmode.utils.PrintlnUtils;

public class ComputerBuilder {
    private String cpu;
    private String mainBoard;//主板
    private String powerSupply;//电源
    private String memoryBank;//内存条
    private String graphicsCard;//显卡
    private String hardDisk;//硬盘
    private String radiator;//散热器
    private String crate;//机箱
    private String display;//显示器
    private String keyBoard;//键盘
    private String mouse;//鼠标
    private String computerChair;//电脑椅
    private String computerDesk;//电脑桌

    @Override
    public String toString() {
        return "ComputerBuilder{" +
                "cpu='" + cpu + '\'' +
                ",\n 主板(mainBoard)='" + mainBoard + '\'' +
                ",\n 电源(powerSupply) ='" + powerSupply + '\'' +
                ",\n 内存条(memoryBank)='" + memoryBank + '\'' +
                ",\n 显卡(graphicsCard)='" + graphicsCard + '\'' +
                ",\n 硬盘(hardDisk)='" + hardDisk + '\'' +
                ",\n 散热器(radiator)='" + radiator + '\'' +
                ",\n 机箱(crate)='" + crate + '\'' +
                ",\n 显示器(display)='" + display + '\'' +
                ",\n 键盘(keyBoard)='" + keyBoard + '\'' +
                ",\n 鼠标(mouse)='" + mouse + '\'' +
                ",\n 电脑椅(computerChair)='" + computerChair + '\'' +
                ",\n 电脑桌(computerDesk)='" + computerDesk + '\'' +
                '}';
    }

    public String getMemoryBank() {
        return memoryBank;
    }

    private void setMemoryBank(String memoryBank) {
        this.memoryBank = memoryBank;
    }

    public String getCpu() {
        return cpu;
    }

    private void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRadiator() {
        return radiator;
    }

    private void setRadiator(String radiator) {
        this.radiator = radiator;
    }

    public String getMainBoard() {
        return mainBoard;
    }

    private void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    private void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getCrate() {
        return crate;
    }

    private void setCrate(String crate) {
        this.crate = crate;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    private void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    private void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public String getDisplay() {
        return display;
    }

    private void setDisplay(String display) {
        this.display = display;
    }

    public String getComputerDesk() {
        return computerDesk;
    }

    private void setComputerDesk(String computerDesk) {
        this.computerDesk = computerDesk;
    }

    public String getKeyBoard() {
        return keyBoard;
    }

    private void setKeyBoard(String keyBoard) {
        this.keyBoard = keyBoard;
    }

    public String getMouse() {
        return mouse;
    }

    private void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getComputerChair() {
        return computerChair;
    }

    private void setComputerChair(String computerChair) {
        this.computerChair = computerChair;
    }


    static class Builder {
        private ComputerBuilder computerBuilder;

        Builder() {
            computerBuilder = new ComputerBuilder();
        }

        Builder installCpu(String cpu) {
            PrintlnUtils.println("安装cpu");
            computerBuilder.setCpu(cpu);
            return this;
        }

        Builder installRadiator(String radiator) {
            PrintlnUtils.println("安装散热器");
            computerBuilder.setRadiator(radiator);
            return this;
        }

        Builder installMainBoard(String mainBoard) {
            computerBuilder.setMainBoard(mainBoard);
            PrintlnUtils.println("安装主板");
            return this;
        }

        Builder installHardDisk(String hardDisk) {
            computerBuilder.setHardDisk(hardDisk);
            PrintlnUtils.println("安装硬盘");
            return this;
        }

        Builder installCrate(String crate) {
            computerBuilder.setCrate(crate);
            PrintlnUtils.println("安装机箱");
            return this;
        }

        Builder installGraphicsCard(String graphicsCard) {
            computerBuilder.setGraphicsCard(graphicsCard);
            PrintlnUtils.println("安装显卡");
            return this;
        }

        Builder installPowerSupply(String powerSupply) {
            computerBuilder.setPowerSupply(powerSupply);
            PrintlnUtils.println("安装电源");
            return this;
        }

        Builder installDisplay(String display) {
            computerBuilder.setDisplay(display);
            PrintlnUtils.println("安装显示器");
            return this;
        }

        Builder installComputerDesk(String computerDesk) {
            computerBuilder.setComputerDesk(computerDesk);
            PrintlnUtils.println("安装电脑桌");
            return this;
        }

        Builder installMemoryBank(String memoryBank) {
            computerBuilder.setMemoryBank(memoryBank);
            PrintlnUtils.println("安装内存条");
            return this;
        }

        Builder installKeyBoard(String keyBoard) {
            computerBuilder.setKeyBoard(keyBoard);
            PrintlnUtils.println("安装键盘");
            return this;
        }

        Builder installMouse(String mouse) {
            computerBuilder.setMouse(mouse);
            PrintlnUtils.println("安装鼠标");
            return this;
        }

        Builder installComputerChair(String computerChair) {
            computerBuilder.setComputerChair(computerChair);
            PrintlnUtils.println("安装电脑椅");
            return this;
        }

        ComputerBuilder builder() {
            PrintlnUtils.println("安装完成");
            return computerBuilder;
        }
    }
}
