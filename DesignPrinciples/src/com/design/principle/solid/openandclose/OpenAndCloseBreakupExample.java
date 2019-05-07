package com.design.principle.solid.openandclose;

public class OpenAndCloseBreakupExample {

	/* 
	 * When there is a new requirements comes in we need to modify the logic. So this breaks the OAP principle
	 * 
	 * Circle class is a new requirements to implement the area of the circle 
	 * so in AreaCalculator class we need to modify the logic.
	 * 
	 * 
	 * public class Rectangle{
		 public double length;
		 public double width;
		}
		
		public class AreaCalculator{
            public double calculateRectangleArea(Rectangle rectangle){
            return rectangle.length *rectangle.width;
            }
        }
        public class Circle{
          public double radius; 
        }
        
        public class AreaCalculator{
            public double calculateRectangleArea(Rectangle rectangle){
            return rectangle.length *rectangle.width;
            }
            public double calculateCircleArea(Circle circle){
                     return (22/7)*circle.radius*circle.radius;
            } 
        }
        
        
  */
}

