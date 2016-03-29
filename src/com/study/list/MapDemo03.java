package com.study.list;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo03 {

	public static void main(String[] args) {
		Map<String,String> m = new HashMap<String,String>();
		m.put("key1", "www");
		m.put("key2", "study");
		m.put("key3", "hey");
		m.put("key4", "why");
		m.put("key5", "cool");
		
		Set<String> s = m.keySet();
		Iterator it1 = s.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		
		Collection<String> v = m.values();
		Iterator it2 = v.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		
	}

}
