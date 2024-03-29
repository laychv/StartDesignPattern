package com.start.designpattern.structural.ProxyPattern.staticproxy;

public class UserDaoProxy implements IUserDao{

    private IUserDao dao;

    public UserDaoProxy(IUserDao dao) {
        this.dao = dao;
    }

    @Override
    public void save() {
        System.out.println("开始事物!!!!!!!");
        dao.save();
        System.out.println("提交事物!!!!!!!");
    }
}
