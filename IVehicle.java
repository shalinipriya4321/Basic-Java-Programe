package com.Capgemini.Basics2.Oops;

public interface IVehicle {
	public static final int age=10;
	public abstract void start();
	static void stop(){
	
		System.out.println("stop ");
	}
	default void move() {
		System.out.println("moving");
	}
	

}
