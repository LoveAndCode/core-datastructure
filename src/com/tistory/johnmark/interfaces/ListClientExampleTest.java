package com.tistory.johnmark.interfaces;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ListClientExampleTest {

	@Test
	@DisplayName("List Type Check")
	public void listTypeCheck() {
		ListClientExample clientExample = new ListClientExample();
		List list = clientExample.getList();
		System.out.println(list.getClass().getSimpleName());
		Assert.assertFalse(list instanceof ArrayList);
	}
}