/*
 * Homework, 'Java Core' module in LOGOS IT Academy
 * Lesson 09 Exception, Java Code Convention
 * task 02
 */

package task02;

/**
 * Application about exceptions
 * 
 * @author Markiian
 * 
 * version 1.0
 * 
 */

public class Methods {

	private double a;
	private double b;

	public Methods(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double add(double a, double b) {

		return a + b;
	}

	public double subtract(double a, double b) {

		return a - b;
	}

	public double multiply(double a, double b) {

		return a * b;
	}

	public double divide(double a, double b) {

		return a / b;

	}

}