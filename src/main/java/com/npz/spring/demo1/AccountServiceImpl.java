package com.npz.spring.demo1;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements AccountService {
    //注入dao类
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    //注入事务管理模板
    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }





    /**
     *
     * @param out
     * @param in
     * @param money
     */
    @Override
    public void transfer(final String out, final String in, final Double money) {
        //无事务管理:没有注入事务管理，发生异常，事务不回滚，数据错误
        //accountDao.outMoney(out,money);
        //int i = 1/0;
        //accountDao.inMoney(in,money);

        //编程式事务管理
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.outMoney(out,money);
                int i = 1/0;
                accountDao.inMoney(in,money);
            }
        });
    }
}
