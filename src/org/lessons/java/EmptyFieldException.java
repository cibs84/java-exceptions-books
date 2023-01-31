package org.lessons.java;

public class EmptyFieldException extends Exception {
	
	public EmptyFieldException(String field) {
		super("Il campo non può essere vuoto!");
	}
	
}
