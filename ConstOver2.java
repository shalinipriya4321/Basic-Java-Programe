package com.Capgemini.Basics2Assignent.Oops;

public class ConstOver2 {
int age;
int a;
ConstOver2(){
	this.age=25;
}
ConstOver2(int a){
	this.a=45;
	
}
public static void main(String[] args) {
	ConstOver2 ref=new ConstOver2(25);
	ConstOver2 ref1=new ConstOver2(46);
	System.out.println(ref.age);
	System.out.println(ref1.a);
}
}
