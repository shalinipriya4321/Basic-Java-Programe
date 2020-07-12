package com.Capgemini.Basics2.Oops;

public class Employ {
	
		protected static int salary;
		protected String compName;
		 Employ(String compName){
			this.compName=compName;
		}
		static void details() {
			System.out.println(salary);
		}
		protected void detailsInfo() {
			System.out.println(this.compName);
		}

}
