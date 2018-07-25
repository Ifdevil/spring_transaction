package com.npz.spring.demo3;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }



    /**
     *
     * @param out
     * @param in
     * @param money
     */
    @Override
    public void transfer(String out, String in, Double money) {
         //声明式事务管理
         accountDao.outMoney(out,money);
         int i = 1/0;
         accountDao.inMoney(in,money);
    }
}
