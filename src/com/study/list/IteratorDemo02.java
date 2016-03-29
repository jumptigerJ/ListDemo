package com.study.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("E");
		list.add("F");
		Iterator<String> ite = list.iterator();
		
		while(ite.hasNext()){
			list.remove(2);  //错误示范，不能在iterator输出的里面进行集合删除操作
			System.out.println(ite.next());
		}
	}

}
