package com.start.designpattern.structural.BridgePattern;

public abstract class CoffeeAdditives {
    /**
     * 具体要往咖啡添加什么由子类实现
     *
     * @return 添加的东西
     */
    public abstract String addSomething();
}
