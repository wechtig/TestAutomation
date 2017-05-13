package at.fhj.swd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import at.fhj.swd.Calculator;

public class CalculatorTest {	

	private Calculator calc;
	
	/**
	 * inits Calculator with CalculatorImpl
	 */
	@Before
	public void setup(){

		// SETUP PHASE
		calc = new CalculatorImpl();
	}

	/**
	 * tests calculator function add
	 * use the function
	 * use assertEquals to verify the result
	 */
	@Test
	public void testAdd() {

		// EXERCISE PHASE
		double value = calc.add(5, 2);

		// VERIFY PHASE
		assertEquals(7, value, 0.001);
	}

	@Test
	public void testAdd2() {

		// EXERCISE PHASE
		double value = calc.add(6, 7);

		// VERIFY PHASE
		assertEquals(13, value, 0.001);
	}

	/**
	 * tests calculator function minus
	 * use the function
	 * use assertEquals to verify the result
	 */
	@Test
	public void testMinus() {

		// EXERCISE PHASE
		double value = calc.minus(5, 2);

		// VERIFY PHASE
		assertEquals(3, value, 0.001);
	}

	/**
	 * tests calculator function multiply
	 * use the function
	 * use assertEquals to verify the result
	 */
	@Test
	public void testMultiply() {

		// EXERCISE PHASE
		double value = calc.multiply(5, 2);

		// VERIFY PHASE
		assertEquals(10, value, 0.001);
	}

	/**
	 * tests calculator function divide
	 * use the function
	 * use assertEquals to verify the result
	 */
	@Test
	public void testDivide() {

		// EXERCISE PHASE
		double value = calc.divide(5, 2);

		// VERIFY PHASE
		assertEquals(2.5, value, 0.001);
	}

	// VERIFY
	@Test(expected = ArithmeticException.class)
	public void testDivideWithNull(){
		// EXERCISE
		calc.divide(5, 0);
	}
}
