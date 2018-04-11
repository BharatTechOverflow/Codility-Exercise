package com.codility.iter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CustomIterator {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("Bharat", "Lanka", "UAE", "China", "HK");
		EvenList<String> evenList = new EvenList<>(myList);
	 
		evenList.forEach(System.out::println);
	}

}

class EvenList<T> implements Iterable<T> {
	private List<T> list;

	public EvenList(List<T> list) {
		this.list = list;
	}

	@Override
	public Iterator<T> iterator() {

		return new Iterator<T>() {
			int currentIndex = 0;
			int listSize = list.size();

			@Override
			public boolean hasNext() {
				return currentIndex < listSize && list.get(currentIndex) != null;
			}

			@Override
			public T next() {
				T t = list.get(currentIndex);
				currentIndex += 1;
				return t;
			}
		};
	}

}