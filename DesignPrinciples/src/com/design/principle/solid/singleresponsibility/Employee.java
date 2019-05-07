package com.design.principle.solid.singleresponsibility;

public class Employee {

	
	private int id;
	private String name;
	private String salary;
	
	/* This breaks the single responsibility principle. Instead of using this method
	 * will separate the login in another class 
	 * 
	 */
	
	/*public boolean isEligibleForPromotion() {
		return false;
	}*/
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSalary() {
		return salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
}
