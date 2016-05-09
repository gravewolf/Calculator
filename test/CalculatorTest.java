package com.george;

import org.junit.Test;

public class CalculatorTest {

	Calculator cal=new Calculator();
	@Test
	public void testAdd() {
		cal.add(2);
	}

	@Test
	public void testSubstract() {
		cal.substract(2);
	}

	@Test
	public void testMultiply() {
		cal.multiply(5);
	}

	@Test
	public void testDivide() {
		cal.divide(6);
	}

	@Test
	public void testSquare() {
		cal.square(5);
	}

	@Test
	public void testSquareRoot() {
		cal.square(6);
	}

	@Test
	public void testClear() {
		cal.clear();
	}

	@Test
	public void testGetResult() {
		cal.getResult();
	}

}
