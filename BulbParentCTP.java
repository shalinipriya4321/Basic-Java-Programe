package com.Capgemini.Basics2Assignent.Oops;

public class BulbParentCTP {

     int a;
     String name;
	void switchon(string n) {
		name.this=n;
		
		System.out.println("switchon");
	}
	void switchon(int a) {
		System.out.println("switchon");
	}
	public static void main(String[] args) {
		
		BulbParentCTP ref=new BulbParentCTP("shalini");
		BulbParentCTP ref1=new BulbParentCTP(25);
		System.out.println(ref1.a);
		System.out.println(ref.name);
		
		
	}
			
		

}
