package mst.com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class Transimissin {
	
	private String s;

	public Transimissin(@Value("SL") String s) {
		super();
		this.s = s;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Transimissin [s=" + s + "]";
	}
	
}
