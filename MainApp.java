package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");

	   /*   HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

	      obj.getMessage();
*/
	      
	      
	      TextEditor te = (TextEditor) context.getBean("textEditor");

	      te.spellCheck();
	}

}
