package com.Capgemini.Basics2Assignent.Oops;

public class Assign {
	
	
	//-------------non static variable--------------------
	
		int x;
		String ppp;
		int y;
		String abc;
		
		
		
		
	//---------static variable-----------
	static int enrollno;
	static String name;
	static int rollno;
	static String fname;
	
	 
	//-----------non static method--------------
	void method1() {
		x=25;
		ppp="shalini";
		y=45;
		abc="pihu";
		Assign.enrollno=25;
		Assign.name="priya";
		Assign.rollno=2;
		Assign.fname="simran";
	}
	void method2() {
		x=24;
		ppp="shalini";
		y=45;
		abc="pihu";
		Assign.enrollno=25;
		Assign.name="priya";
		Assign.rollno=2;
		Assign.fname="simran";
	}
	void method3() {
		x=25;
		ppp="shalini";
		y=45;
		abc="pihu";
		Assign.enrollno=25;
		Assign.name="priya";
		Assign.rollno=2;
		Assign.fname="simran";
		
	}
	void method4() {
		x=25;
		ppp="shalini";
		y=45;
		abc="pihu";
		Assign.enrollno=25;
		Assign.name="priya";
		Assign.rollno=2;
		Assign.fname="simran";
		
	}
	//---------------static method-------------------
	static void method5(){
		Assign.enrollno=25;
		Assign.name="priya";
		Assign.rollno=2;
		Assign.fname="simran";
		
	}
	static void method6() {
		Assign.enrollno=25;
		Assign.name="priya";
		Assign.rollno=2;
		Assign.fname="simran";
		
	}
	static void method7() {
		Assign.enrollno=25;
		Assign.name="priya";
		Assign.rollno=2;
		Assign.fname="simran";
		
	}
	static void method8() {
		Assign.enrollno=25;
		Assign.name="priya";
		Assign.rollno=2;
		Assign.fname="simran";
		
	}
	static {
		
		enrollno=25;
		name="priya";
		rollno=2;
		fname="simran";
		
	}
	public static void main(String[] args) {
		
		Assign ref=new Assign();
		ref.method1();
		ref.method2();
		ref.method3();
		ref.method4();
		Assign.method5();
		Assign.method6();
		Assign.method7();
		Assign.method8();
		System.out.println(ref.x);
		System.out.println(ref.ppp);
		System.out.println(ref.y);
		System.out.println(ref.abc);
		System.out.println(Assign.enrollno);
		System.out.println(Assign.name);
		System.out.println(Assign.rollno);
		System.out.println(Assign.fname);
		
		
		
		
	}
	}
	
	
	
