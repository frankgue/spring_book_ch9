package com.wiley.beginningspring.ch9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        MyBean myBean = applicationContext.getBean(MyBean.class);
        System.out.println(myBean.getMessage());
    }
}
