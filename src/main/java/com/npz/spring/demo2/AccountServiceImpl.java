package com.npz.spring.demo2;

public class AccountServiceImpl implements AccountService {

    private com.npz.spring.demo2.AccountDao accountDao;

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
