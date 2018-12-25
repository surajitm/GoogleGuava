package com.guava.GuavaTutorial;

import com.google.common.base.Optional;

/*
 * Using Optional we can handle 
 * NullpointerException
 */

public class OptionalClass {

	public static void main(String[] args) {
		Integer a = new Integer(20);
		Integer b = null;
		Optional<Integer> op1 = Optional.fromNullable(a);
		Optional<Integer> op2 = Optional.fromNullable(b);
		System.out.println(sum(op1, op2));
	}

	public static int sum(Optional<Integer> a, Optional<Integer> b) {
		int val1 = (!a.isPresent()) ? a.or(new Integer(0)) : a.get();
		int val2 = (!b.isPresent()) ? b.or(new Integer(0)) : b.get();
		return val1 + val2;
	}
}
