
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;
import pojo.Student;
import pojo.User;

/**
 * @description
 * @author:yujie
 * @Created on 2020/6/16
 */
public class MyTest {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());


    }

   @Test
    public void test2(){
       ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");

       User user = context.getBean("user", User.class);
       System.out.println(user.toString());

   }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");

        User user = context.getBean("user2", User.class);
        System.out.println(user.toString());

    }
}
