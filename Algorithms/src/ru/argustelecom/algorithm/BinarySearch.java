package ru.argustelecom.algorithm;


import java.util.List;


public class BinarySearch {
	
	public static <T extends Comparable<T>> int search(List<T> list, T x){

		int leftmost = 0;
		int rightmost = list.size() - 1;
		
		if (null != x) {
			while (rightmost - leftmost > 1) {
				int mid = leftmost + (rightmost - leftmost) / 2;
				if (list.get(mid).compareTo(x) < 0) {
					leftmost = mid;
				} else {
					rightmost = mid;
				}
			}

			for (int i = leftmost; i <= rightmost; i++) {
				if (list.get(i).equals(x)) {
					return i;
				}
			}
		}
		return -1;
	}
}
