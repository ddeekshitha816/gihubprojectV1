package com.Springmaven.auto.Mywireauto;


public class Student {
	
	private Address Address;

	public Address getAddress() {
		return Address;
	}

	public void setAddress(Address address) {
		Address = address;
	}

	public Student(com.Springmaven.auto.Mywireauto.Address address) {
		super();
		Address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public String toString() {
		return "Student [Address=" + Address + "]";
	}
	
	

}
