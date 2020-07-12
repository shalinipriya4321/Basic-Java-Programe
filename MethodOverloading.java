package com.Capgemini.Basics2Assignent.Oops;

public class MethodOverloading {
	int no;
	String name;
	int bankno;
	//--------------ex 1---------------------------
	--------------------------------------//
	void switchon() {
		System.out.println("switchon");
	}
	void switchon(int no) {
		System.out.println("override switchon method");
		
	}
	//--------------ex 2----------------------------
	void login(int no,String name) {
		System.out.println("login method");
		
	}
	void login(int no,int bankno,String name) {
		System.out.println("Override login method");
		
	}
	//---------------ex 3----------------------------
	void start() {
		System.out.println("Start method");
		
	}
	void start(int no) {
		System.out.println("Override Start method");
		
	}
	//------------------ex 4------------------------
	void SwitchOff() {
		System.out.println("SwitchOff method");
		
	}
	void SwitchOff(int no) {
		System.out.println("SwitchOff override method");
		
	}
	
	public static void main(String[] args) {
		MethodOverloading ref1=new MethodOverloading();
		ref1.switchon();
		ref1.switchon(23);
		ref1.login(25, "abc");
		ref1.login(25,4567,"xyzabc");
		ref1.start();
		ref1.start(67);
		ref1.SwitchOff();
		ref1.SwitchOff(24);
		
		
		
		
		
	}
	
	

}
