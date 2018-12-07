package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {
	public static void main (String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("TextEditor Example:");
	    
	    TextEditor te = (TextEditor) context.getBean("textEditor");
	    te.spellCheck();
	}
}
