package org.lessons.java;

public class PageNumberException extends Exception {
	private int pageNumber;
	
	public PageNumberException(int pageNumber) {
		super("Numero pagine non valido!");
		this.pageNumber = pageNumber;
	}
	
	public int getPageNumber() {
		return this.pageNumber;
	}
}
