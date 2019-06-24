package com.onlytrailcodeforselenium;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(100, "mahesh");
		System.out.println(m);
		m.put(200, "bhaskar");
		m.put(300, "prerna");
		m.put(400, "tanshu");
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		Set s=m.entrySet();
		System.out.println(s);
		Iterator itr = s.iterator();
		while(itr.hasNext()){
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+"..."+m1.getValue());
			if(m1.getKey().equals("mahesh")){
				m1.setValue(700);
			}
			
		}
		
		System.out.println(m);

	}


}
