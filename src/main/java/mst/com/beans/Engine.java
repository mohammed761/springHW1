package mst.com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class Engine {
	
	private String capicity;
	
	private int numOfCylinder;
	public Engine(@Value("V8")String capicity,@Value("310") int numOfCylinder) {
		super();
		this.capicity = capicity;
		this.numOfCylinder = numOfCylinder;
	}
	public String getCapicity() {
		return capicity;
	}
	public void setCapicity(String capicity) {
		this.capicity = capicity;
	}
	public int getNumOfCylinder() {
		return numOfCylinder;
	}
	public void setNumOfCylinder(int numOfCylinder) {
		this.numOfCylinder = numOfCylinder;
	}
	@Override
	public String toString() {
		return "Engine [capicity=" + capicity + ", numOfCylinder=" + numOfCylinder + "]";
	}
	
}
