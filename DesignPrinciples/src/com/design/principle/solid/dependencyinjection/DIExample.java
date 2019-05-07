package com.design.principle.solid.dependencyinjection;

public class DIExample {
	
		Address address;  
		//This is constructor DI  
		DIExample(Address address){  
		this.address=address;  
		}  
		//This is setter injection
		public void setAddress(Address address){  
		this.address=address;  
		}  
		  

}
