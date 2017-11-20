package com.wwq.tag;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student s = (Student) o1;
		Student s1 = (Student) o2;
		// 返回值1：p1>p2;0相等;-1:p1<p2
		return s.getAge() - s1.getAge();
	}
}
