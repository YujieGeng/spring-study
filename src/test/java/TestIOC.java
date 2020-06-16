import com.geng.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description
 * @author:yujie
 * @Created on 2020/6/16
 */
public class TestIOC {
    public static void main(String[] args) {

        //获取spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //我们的对象都在spring中管理了，要获取一个对象，直接去取就好了
        Hello hello = (Hello) context.getBean("hello");

        System.out.println(hello.toString());

    }
}
