package com.study.list;

import java.util.HashMap;
import java.util.Map;

public class MapDemo02 {

	public static void main(String[] args) {
		Map<String,String> m = new HashMap<String,String>();
		m.put("key1", "www");
		m.put("key2", "study");
		m.put("key3", "hey");
		m.put("key4", "why");
		m.put("key5", "cool");
		if(m.containsKey("key1")){
			System.out.println("key����");
		}else{
			System.out.println("key������");
		}
		if(m.containsValue("cool1")){
			System.out.println("value����");
		}else{
			System.out.println("value������");
		}
	}

}
