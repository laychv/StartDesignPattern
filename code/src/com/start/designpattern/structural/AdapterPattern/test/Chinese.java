package com.start.designpattern.structural.AdapterPattern.test;

public class Chinese extends Middle implements Impl {

    @Override
    public void translate() {
        System.out.println("翻译中文");
    }
}
