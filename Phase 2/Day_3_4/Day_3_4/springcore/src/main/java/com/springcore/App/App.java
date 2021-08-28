package com.springcore.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        Student s1 = (Student)context.getBean("s1");
        System.out.println(s1);
        
        Employee e1 = (Employee) context.getBean("e1");
        System.out.println(e1);
        
    }
}