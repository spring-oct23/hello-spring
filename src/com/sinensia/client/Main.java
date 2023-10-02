package com.sinensia.client;

import com.sinensia.SpringHelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SpringHelloWorld hello = (SpringHelloWorld) context.getBean("helloWorldBean");
        hello.sayHello();
    }
}
