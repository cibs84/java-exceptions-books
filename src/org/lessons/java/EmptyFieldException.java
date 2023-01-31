package org.lessons.java;

public class EmptyFieldException extends Exception {

	public EmptyFieldException() {
		super("I campi Titolo, Autore ed Editore non possono rimanere vuoti!");
	}
}
