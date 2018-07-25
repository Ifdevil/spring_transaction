import com.npz.spring.demo1.AccountService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 编程式事务管理
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test1 {

    private static Logger logger = Logger.getLogger(test1.class);

    @Resource(name="accountService")
    private AccountService accountService;

    @Test
    public void demo1(){
        accountService.transfer("aaa","bbb",200d);
        logger.info("success");
    }
}
