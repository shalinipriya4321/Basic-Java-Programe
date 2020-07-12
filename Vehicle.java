package com.Capgemini.Basics2.Oops;

abstract class Vehicle {
	int cost;
	static String name;
	protected abstract void start(); 
		Vehicle(int cost){
			this.cost=cost;
		}
		static void add() {
		System.out.println(name);
	}
		void add(int a) {
			System.out.println(this.cost);
		}

}
