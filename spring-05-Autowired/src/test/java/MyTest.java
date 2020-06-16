import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;
import pojo.People;

/**
 * @description
 * @author:yujie
 * @Created on 2020/6/16
 */
public class MyTest {
    @Test
    public void test1(){
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        People people = context.getBean("people", People.class);

        people.getCat().shout();
        people.getDog().shout();
        System.out.println(people.toString());


    }
}
