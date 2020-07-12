package com.Capgemini.Basics2.Oops;

public class TestPaytm {
	public static void main(String[] args) {
		Irctc i=new Irctc();
		Paytm p1=new Paytm(i);
		p1.bookTrainTicket("banglore", "bhopal");
		
	}

}
