package com.mphasis.basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import corn.mphasis.basics.employee;

public class Collection {


	public static <Employee1> void main(String[]args) {
		Employee1 emp1=(101,"lavi");
		Employee1 emp2=(102,"kk");
		Employee1 emp3=(103,"puhhhp");
		
		ArrayList<Employee1>al=new ArrayList<>();
		
	
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
	Iterator i=(Iterator) al.iterator();
	//while i.next();{
		//Employee1 e= i.next();
		
		//System.out.println(e.empname+" "+e.empno);
	
		
	
