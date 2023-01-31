package org.lessons.java;

public class Libro {
	String title;
	int pageNumber;
	String author;
	String editor;
	
	public Libro(String title, int pageNumber, String author, String editor) throws EmptyFieldException, PageNumberException {
		this.validateEmptyField(title);
		this.validatePageNumber(pageNumber);
		this.validateEmptyField(author);
		this.validateEmptyField(editor);
		
		this.pageNumber = pageNumber;
		this.title = title;
		this.author = author;
		this.editor = editor;
	}

	public void validatePageNumber(int pageNumber) throws PageNumberException {
		if (pageNumber <= 0) {
			throw new PageNumberException(pageNumber);
		}
	}
	
	public void validateEmptyField(String field) throws EmptyFieldException {
		if (field.isEmpty()) {
			throw new EmptyFieldException();
		}
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws EmptyFieldException {
		this.validateEmptyField(title);
		this.title = title;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) throws PageNumberException {
		this.validatePageNumber(pageNumber);
		this.pageNumber = pageNumber;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) throws EmptyFieldException {
		this.validateEmptyField(author);
		this.author = author;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) throws EmptyFieldException {
		this.validateEmptyField(editor);
		this.editor = editor;
	}

	@Override
	public String toString() {
		return "Libro [title=" + title + ", pageNumber=" + pageNumber + ", author=" + author + ", editor=" + editor
				+ "]";
	}
}
