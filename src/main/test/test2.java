import com.npz.spring.demo1.AccountService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Spring的声明式事务管理的方式：基于TransactionProxyFactoryBean的XML方式的配置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class test2 {

//  @Resource(name="accountService")
    @Resource(name="accountServiceProxy")
    private com.npz.spring.demo2.AccountService accountService;


    private static Logger logger = Logger.getLogger(test1.class);

    @Test
    public void demo2(){
        accountService.transfer("aaa","bbb",200d);
    }
}
