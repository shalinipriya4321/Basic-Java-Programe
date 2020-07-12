package com.Capgemini.Basics2.Oops;

public class AccessSpecifierClass {
	private static int salary;
	private String compName;
	private AccessSpecifierClass(String compName){
		this.compName=compName;
	}
	private static void details() {
		System.out.println(salary);
	}
	private void detailsInfo() {
		System.out.println(this.compName);
	}
	

}
