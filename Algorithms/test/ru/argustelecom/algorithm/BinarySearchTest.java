package ru.argustelecom.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static ru.argustelecom.algorithm.BinarySearch.search;

import org.junit.Test;

public class BinarySearchTest {

	private List<Integer> listInteger = new ArrayList<Integer>();
	private List<String> listString = new ArrayList<String>();
	private Random random = new Random();
	private double doubleInteger = Integer.MAX_VALUE*2+1;

	@Test
	public void shouldDontFindElementInIntegerListSizeZero() {	
		assertEquals(-1, search(listInteger, 1));
	}

	@Test
	public void shouldDontFindElementInStringListSizeZero() {		
		assertEquals(-1, search(listString, "a"));
	}

	@Test
	public void shouldFindElementInIntegerListWithSizeOne() {
		listInteger.add(1);
		assertEquals(0, search(listInteger, 1));
	}
	
	@Test
	public void shouldFindElementInStringListWithSizeOne() {
		listString.add("a");
		assertEquals(0, search(listString, "a"));
	}
	
	@Test
	public void shouldDontFindElementInIntegerListWithSizeOne() {
		listInteger.add(1);
		assertEquals(-1, search(listInteger, 2));
	}
	
	@Test
	public void shouldDontFindElementInStringListWithSizeOne() {
		listString.add("a");
		assertEquals(-1, search(listString, "b"));
	}

	@Test
	public void shouldFindElementInIntegerListWithSizeTwo() {
		listInteger.add(1);
		listInteger.add(2);
		assertEquals(1, search(listInteger, 2));
	}
	
	@Test
	public void shouldFindElementInStringListWithSizeTwo() {
		listString.add("a");
		listString.add("b");
		assertEquals(1, search(listString, "b"));
	}
	
	@Test
	public void shouldDontFindElementInIntegerListWithSizeTwo() {
		listInteger.add(1);
		listInteger.add(2);
		assertEquals(-1, search(listInteger, 3));
	}
	
	@Test
	public void shouldDontFindElementInStringListWithSizeTwo() {
		listString.add("a");
		listString.add("b");
		assertEquals(-1, search(listString, "c"));
	}

	@Test
	public void shouldFindElementInIntegerListWithSizeDoubleInteger() {
	
		assertEquals(1, search(listInteger, 2));
	}
	
	@Test
	public void shouldFindElementInStringListWithSizeDoubleInteger() {
		listString.add("a");
		assertEquals(1, search(listString, "b"));
	}
	
	
	
	
	

	
	
	
	
	@Test
	public void shouldFindFirstElementInIntegerList() {
		
	}

	@Test
	public void shouldFindLastElementInStringList() {

	}

	private List<?> createList(Double size, String type) {
		if ("String".equals(type)) {
			return createIntegerList(size);
		}
		if ("Integer".equals(type)) {
			createIntegerStringList(size);
		}
		return null;
	}
	
	private List<Integer> createIntegerList(Double size) {
		
	}
	
	private List<String> createIntegerStringList(Double size) {
	
	}
	
	public String generateString() {
		String characters = "1234567890-qwertyuiop[]asdfghjkl;'zxcvbnm,.";
		char[] text = new char[10];
		for (int i = 0; i < 10; i++) {
			text[i] = characters.charAt(random.nextInt(characters.length()));
		}
		return new String(text);
	}

}
