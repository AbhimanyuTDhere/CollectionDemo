package com.git.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("abhi");
		list.add("shubham");
		list.add("abhi");
		list.add("abhi");
		//System.out.println(list);
		for (String s : list) {
			System.out.println(s);
		}
	}

}
