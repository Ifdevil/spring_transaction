package com.npz.spring.demo3;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void outMoney(String out, Double money) {
        String sql = "update account set money = money - ? where username = ? ";
        this.getJdbcTemplate().update(sql,new Object[] {money, out});
        System.out.println("success");
    }

    @Override
    public void inMoney(String in, Double money) {
        String sql = "update account set money = money + ? where username = ?";
        this.getJdbcTemplate().update(sql,money,in);
    }
}
