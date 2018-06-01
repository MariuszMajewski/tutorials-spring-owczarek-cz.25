package pl.mrmario.tutorials.spring.owczarek.cz24;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.mrmario.tutorials.spring.owczarek.cz24.implementations.CountersUser;

/**
 * @author Artur Owczarek
 * 	MrMario108
 */
public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		CountersUser bean = context.getBean("countersUser", CountersUser.class);
		
		System.out.println("bean.getPrototypeCounter1()");
		System.out.println(bean.getPrototypeCounter1().getCounter());
		System.out.println(bean.getPrototypeCounter1().getCounter());
		
		System.out.println("bean.getPrototypeCounter2()");
		System.out.println(bean.getPrototypeCounter2().getCounter());
		System.out.println(bean.getPrototypeCounter2().getCounter());
		
		System.out.println("bean.getSingletonCounter1()");
		System.out.println(bean.getSingletonCounter1().getCounter());
		System.out.println(bean.getSingletonCounter1().getCounter());
		
		System.out.println("bean.getSingletonCounter2()");
		System.out.println(bean.getSingletonCounter2().getCounter());
		System.out.println(bean.getSingletonCounter2().getCounter());
		
		
	}
}