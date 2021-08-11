package com.tistory.johnmark.interfaces;

import java.util.LinkedList;
import java.util.List;

public class ListClientExample {
	private List list;

	public ListClientExample() {
		this.list = new LinkedList();
	}

	public static void main(String[] args) {
		ListClientExample clientExample = new ListClientExample();
		List list = clientExample.getList();
		System.out.println(list);
	}

	public List getList() {
		return this.list;
	}
}
