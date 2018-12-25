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
		int val1 = 0;
		int val2 = 0;
		if (!a.isPresent()) {
			System.out.println("a value is not present.");
			val1 = a.or(new Integer(0));
		} else {
			val1 = a.get();
		}

		if (!b.isPresent()) {
			System.out.println("b value is not present.");
			val2 = b.or(new Integer(0));
		} else {
			val2 = b.get();
		}
		return val1 + val2;
	}
}
