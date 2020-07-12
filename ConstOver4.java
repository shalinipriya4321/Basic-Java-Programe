package com.Capgemini.Basics2Assignent.Oops;

public class ConstOver4 {
	int enrollno;
	String name;
	ConstOver4(int a){
		this.enrollno=a;
		
	}
	ConstOver4(String s){
		this.name=s;
		
	}
	public static void main(String[] args) {
		ConstOver4 ref=new ConstOver4(11);
		ConstOver4 ref1=new ConstOver4("Shalini");
		System.out.println(ref.enrollno);
		System.out.println(ref1.name);
		
		
	}
}
