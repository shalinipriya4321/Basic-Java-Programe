package com.Capgemini.Basics2Assignent.Oops;

public class ConstOverloading {
	int age;
	String name;
	ConstOverloading(int a){
		this.age=a;
		
	}
	ConstOverloading(String s){
		this.name=s;
		
	}
	public static void main(String[] args) {
		ConstOverloading ref=new ConstOverloading(25);
		ConstOverloading ref1=new ConstOverloading("Shalini");
		System.out.println(ref.age);
		System.out.println(ref1.name);
		
		
		
	}
	
		
		
	}
	
	

