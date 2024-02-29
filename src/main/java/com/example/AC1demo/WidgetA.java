package com.example.AC1demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WidgetA {


   private WidgetB b;
   
   //Tight Coupling
//   public WidgetA(){
//    	this.b = new WidgetB();
//    	b.doSomething();
//   }

    // dependency injection   
    // YOUR CODE HERE
	@Autowired
	public WidgetA(WidgetB widgetB) {
	   this.b = widgetB;
	   b.doSomething();
	}

	public String doSomething() {
		return("CALLED doSomething() in WidgetA");
	}

}