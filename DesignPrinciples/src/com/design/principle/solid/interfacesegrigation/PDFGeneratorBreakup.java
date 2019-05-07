package com.design.principle.solid.interfacesegrigation;

public class PDFGeneratorBreakup implements InterfaceSegrigationBreakupExample{

	/*
	 * we need to override unnecessarily this method as this is not required to generate the PDF
	 * So to solve this problem we can use the IS principle
	 */
	@Override
	public void generateExcel() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void generatePDF() {
		// TODO Auto-generated method stub
		
	}

}
