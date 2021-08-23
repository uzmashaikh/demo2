package org.uzma.javaBrains;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("file:Spring.xml");
		Triangle triangle =(Triangle) context.getBean("triangle");
		triangle.Draw();
		
	}

}
