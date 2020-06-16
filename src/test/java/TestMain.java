import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMySQLImpl;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description
 * @author:yujie
 * @Created on 2020/6/16
 */
public class TestMain {



    public static void main(String[] args) {
        /*
        UserServiceImpl userService = new UserServiceImpl();

        userService.setUserDao(new UserDaoImpl());
        userService.getUser();
         */

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");

        userServiceImpl.getUser();
    }
}
