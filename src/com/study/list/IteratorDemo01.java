package com.study.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("E");
		list.add("F");
		Iterator<String> ite = list.iterator();
		
		while(ite.hasNext()){
			String str = ite.next();
			if("A".equals(str)){
				ite.remove();
			}else{
				System.out.println(str);
			}
		}
	}

}
