package pl.mrmario.tutorials.spring.owczarek.cz24.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountersUser {
	
	@Autowired
	private PrototypeCounter prototypeCounter1;
	
	@Autowired
	private PrototypeCounter prototypeCounter2;
	
	@Autowired
	private SingletonCounter singletonCounter1;
	
	@Autowired
	private SingletonCounter singletonCounter2;

	public PrototypeCounter getPrototypeCounter1() {
		return prototypeCounter1;
	}

//	public void setPrototypeCounter1(PrototypeCounter prototypeCounter1) {
//		this.prototypeCounter1 = prototypeCounter1;
//	}

	public PrototypeCounter getPrototypeCounter2() {
		return prototypeCounter2;
	}

//	public void setPrototypeCounter2(PrototypeCounter prototypeCounter2) {
//		this.prototypeCounter2 = prototypeCounter2;
//	}

	public SingletonCounter getSingletonCounter1() {
		return singletonCounter1;
	}

//	public void setSingletonCounter1(SingletonCounter singletonCounter1) {
//		this.singletonCounter1 = singletonCounter1;
//	}

	public SingletonCounter getSingletonCounter2() {
		return singletonCounter2;
	}

//	public void setSingletonCounter2(SingletonCounter singletonCounter2) {
//		this.singletonCounter2 = singletonCounter2;
//	}

	
}
