package mst.com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import mst.com.beans.Car;

@Configuration
@ComponentScan({"mst.com"})
public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Runner.class);
		
		Car car=context.getBean(Car.class);
		System.out.println(car);
	}

}
