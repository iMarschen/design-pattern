package org.desgin.buildFactory;
/*
* 这是一个复杂对象，需要顺序构建，本包使用创建者设计模式来创建Computer对象
* */
public class Computer {
    // 鼠标
    public String mouse;
    // 键盘
    public String keyboard;
    // cpu
    public String cpu;
    // 内存
    public String memoryBank;
    // 主板
    public String mainBoard;

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemoryBank() {
        return memoryBank;
    }

    public void setMemoryBank(String memoryBank) {
        this.memoryBank = memoryBank;
    }

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public static class Builder{

        private final Computer computer = new Computer();

        public Builder buildMouse(String type){
            computer.setMouse("安装了一个"+ type +"鼠标");
            return this;
        }

        public Builder buildKeyboard(String type){
            computer.setKeyboard("安装了一个"+ type +"键盘");
            return this;
        }

        public Builder buildCpu(String type){
            computer.setCpu("安装了一个"+ type +"Cpu");
            return this;
        }


        public Builder buildMemoryBank(String type){
            computer.setMemoryBank("安装了一个"+ type +"MemoryBank");
            return this;
        }

        public Builder buildMainBoard(String type){
            computer.setMainBoard("安装了一个"+ type +"mainBoard");
            return this;
        }

        public Computer build(){
            return computer;
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "mouse='" + mouse + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", cpu='" + cpu + '\'' +
                ", memoryBank='" + memoryBank + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                '}';
    }
}
