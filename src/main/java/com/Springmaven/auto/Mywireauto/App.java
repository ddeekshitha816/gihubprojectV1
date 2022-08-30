package com.Springmaven.auto.Mywireauto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext cn=new ClassPathXmlApplicationContext("com/springmaven/auto/configauto.xml");
        Student a=(Student)cn.getBean("std");
        System.out.println(a);
        
    }
}
