package com.npz.spring.demo3;

public interface AccountDao {
    void outMoney(String out, Double money);
    void inMoney(String in, Double money);
}
