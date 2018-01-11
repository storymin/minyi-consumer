package server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gzu.SayHello;

public class ConsumerTest
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"spring.xml"});
        context.start();
        SayHello sayHello = (SayHello) context.getBean("sayHello");
        sayHello.hello("Dubbo!");
    }
}
