package com.design.principle.solid.openandclose;

public class Circle implements Shape{
	  public double radius;
	  public double calculateArea(){
	    return (22/7)*radius*radius;
	  }
}
