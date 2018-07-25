import com.npz.spring.demo1.AccountService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Spring的声明式事务管理的方式：基于AspectJ的XML方式的配置（tx/aop)
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class test3{

    @Resource(name="accountService3")
    private com.npz.spring.demo3.AccountService accountService;

    private static Logger logger = Logger.getLogger(test1.class);

    @Test
    public void demo3(){
        accountService.transfer("aaa","bbb",200d);
    }
}
