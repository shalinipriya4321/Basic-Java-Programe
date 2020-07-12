package com.Capgemini.Basics2.Oops;

public class AccessSpecifierSubClass extends AccessSpecifierClass{
	/*private AccessSpecifierClass(String compName){
		this.compName=compName;
		System.out.println("not override");*/
	}
	private static void details() {
		System.out.println(sal);
	}
	private void detailsInfo() {
		System.out.println(details);
	}
	public static void main(String[] args) {
		AccessSpecifierSubClass a=new AccessSpecifierSubClass();
		AccessSpecifierClass ref=new AccessSpecifierSubClass();
		
		
		
	}
	
	

}
