package com.study.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {

	public static void main(String[] args) {
		List<String> lists = null;
		lists = new ArrayList<String>();
		lists.add("A");
		lists.add("B");
		lists.add("A");
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
		}
		lists.remove(0);
		System.out.println("ɾ��֮��");
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
		}
		System.out.println("�����Ƿ�Ϊ��"+lists.isEmpty());
		System.out.println("B�Ƿ����"+lists.indexOf("B"));//������ڷ��������������ڷ���-1
		
	}

}
