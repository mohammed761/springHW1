package mst.com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	private Engine engine;
	@Autowired
	private Transimissin transimissin;
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Transimissin getTransimissin() {
		return transimissin;
	}
	public void setTransimissin(Transimissin transimissin) {
		this.transimissin = transimissin;
	}
//	public Car(Engine engine, Transimissin transimissin) {
//		super();
//		this.engine = engine;
//		this.transimissin = transimissin;
//	}
	@Override
	public String toString() {
		return "Car [engine=" + engine + ", transimissin=" + transimissin + "]";
	}
	
	
	
}
