package Day18;

import java.io.Serializable;

public class Person_ implements Serializable { //시리얼 코드가 필요하다.
	private static final long SerialVersionUID = 1L;
	private String myName;
	private int myAge;
	
	public Person_(String string, int i) {
		// TODO Auto-generated method stub
		this.setMyNameMyAge(myName, myAge);
	}
	
	public void setMyNameMyAge(String myName, int myAge) {
		this.myAge = myAge;
		this.myName = myName;
	}

}
