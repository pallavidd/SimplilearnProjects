package com.mphasis.basic;

public class Thread {
public void run() {
	for(int i=0;i<9;i++) {
		System.out.println(i);
		
	}
}
}
public class ThreadEx {
public static void main(String[]args) {
	NumIterator num=new NumIterator();
	num.start();
}
}