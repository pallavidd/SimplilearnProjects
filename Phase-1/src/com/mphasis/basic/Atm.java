package com.mphasis.basic;

public class Atm {
int amount =100000;
void withdraw(int amt)throws InterruptedException{
	System.out.println("withdraw started");
	int balance = 100;
	if(balance<amt) {
		System.out.println("less balance;wait deposit happen");
		
			wait();
			
	}
	balance-=amt;
	System.out.println("withdraw is completed");
	
	
	}


void deposit(int amt) {
	System.out.println("deposit is processed");
	@SuppressWarnings("unused")
	int balance = amt;
	System.out.println("deposit is completed");
	notify();
	}


public Atm() {
	super();
	// TODO Auto-generated constructor stub
}


public static void main(String[]args) {
	@SuppressWarnings("unused")
	AtmCustomer cust=new AtmCustomer();
	new Thread() {
		public void run() {
			 //cust.withdraw(80000);
		}
			
		public void start() {
			// TODO Auto-generated method stub
			
		}

		@SuppressWarnings("unused")
		void Catch (InterruptedException e) {
			e.printStackTrace();
			
		}
	
}.start();

}
}

