package com.mphasis.basic;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash {
//@SuppressWarnings("retypes")
public static void main(String[]args) {
	LinkedHashMap<Integer,String>hm=new LinkedHashMap<>();
	hm.put(1, "kk");
	hm.put(2, "pp");
	hm.put(1, "null,null");
hm.put(1, "null,null");
hm.put(1, "3,null");
Set<Entry<Integer, String>> s=hm.entrySet();
Iterator<Entry<Integer, String>> i=s.iterator();
while(i.hasNext());{
	//LHS Map=RHS()){
	@SuppressWarnings("rawtypes")
	Map.Entry map=(Entry)i.next();
	System.out.println(map.getKey()+" "+map.getValue());
	
}
}
}
