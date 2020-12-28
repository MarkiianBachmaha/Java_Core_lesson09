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

public class MyException extends Exception {

	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);
	}

}