import com.npz.spring.demo1.AccountService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Spring的声明式事务管理的方式：注解事务
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class test4{

    @Resource(name="accountService4")
    private com.npz.spring.demo4.AccountService accountService;

    private static Logger logger = Logger.getLogger(test1.class);

    @Test
    public void demo4(){
        accountService.transfer("aaa","bbb",200d);
    }
}
