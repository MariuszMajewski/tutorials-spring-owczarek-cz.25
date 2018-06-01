package pl.mrmario.tutorials.spring.owczarek.cz24.implementations;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import pl.mrmario.tutorials.spring.owczarek.cz24.Counter;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class PrototypeCounter extends Counter{
//	private int count = 0;
//	
//	public void log(String message) {
//		System.out.println(count++ + " : " +message);
//		
//	}

}
