package test;

import java.util.Date;

public final class ImmutableClass {

	private final String name;
	private final int rollno;
	
	private final Date mutableDate;


	public ImmutableClass(String name, int rollno, Date date) {
		this.name = name;
		this.rollno = rollno;	
		this.mutableDate = new Date(date.getTime());
	}

	public String getName() {
		return name;
	}

	public int getRollno() {
		return rollno;
	}
	
	//create new instances for immutable objects inside immutable 
	//class in the getter method
	public Date getMutableDate() {
		return new Date(mutableDate.getTime());
	}
	
}
