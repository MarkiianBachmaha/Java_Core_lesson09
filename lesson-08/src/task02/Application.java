/*
 * Homework, 'Java Core' module in LOGOS IT Academy
 * Lesson 09 Exception, Java Code Convention
 * task 02
 */

package task02;

import java.util.Scanner;

/**
 * Application about exceptions
 * 
 * @author Markiian
 * 
 * version 1.0
 * 
 */

public class Application {

	public static void main(String[] args) throws Exception {

		double a = 0;
		double b = 0;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter number a:");

		if (s.hasNextDouble()) {
			a = s.nextDouble();
		} else {
			System.out.println("This number is not double, enter double");
			System.exit(0);
			s.close();
		}

		System.out.println("Enter number b:");

		if (s.hasNextDouble()) {
			b = s.nextDouble();
		} else {
			System.out.println("This number is not double, enter double");
			System.exit(0);
			s.close();
		}

		try {
			if ((a < 0) && (b < 0)) {
				throw new IllegalArgumentException("Illegal Exception");
			}
			if (((a == 0) && (b != 0)) || ((a != 0) && (b == 0))) {
				throw new ArithmeticException("ArithmeticException");
			}
			if ((a == 0) && (b == 0)) {
				throw new IllegalAccessException("IllegalAccessException");
			}
			if ((a > 0) && (b > 0)) {
				throw new MyException("My Exception!");
			}

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

		Methods methods = new Methods(a, b);
		System.out.println("Summary: " + methods.add(a, b));
		System.out.println("Substraction: " + methods.subtract(a, b));
		System.out.println("Multiply: " + methods.multiply(a, b));
		System.out.println("Divide: " + methods.divide(a, b));

	}

}