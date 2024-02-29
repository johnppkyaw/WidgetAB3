package com.example.AC1demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Ac1demoApplication {

	public static void main(String[] args) {

    ConfigurableApplicationContext context =  SpringApplication.run(Ac1demoApplication.class, args);

    // get the bean from spring container
    //YOUR_CODE_HERE
    WidgetA widBean = context.getBean(WidgetA.class);

//    // old way, tight coupling
//    WidgetA wid = new WidgetA();

    // call a method on the bean
//    System.out.println(wid.doSomething());
    System.out.println(widBean.doSomething());
 
    // close the context
    context.close();
    
	}
}