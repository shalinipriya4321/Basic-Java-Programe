package com.Capgemini.Basics2Assignent.Oops;

public class ConstOver3 {
	int rollno;
	String name;
	ConstOver3(int a){
		this.rollno=a;
		
	}
	ConstOver3(String s){
		this.name=s;
		
	}
	public static void main(String[] args) {
		ConstOver3 ref=new ConstOver3(25);
		ConstOver3 ref1=new ConstOver3("Shalini");
		System.out.println(ref.rollno);
		System.out.println(ref1.name);
		
		
		
	}
	
		
		
	}
	


