package LibraryCore;

import java.util.UUID;

public class Books {
	
	public UUID getISBN() {
		return ISBN;
	}
	public void setISBN(UUID iSBN) {
		ISBN = iSBN;
	}
	public String getNameOfBook() {
		return nameOfBook;
	}
	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishing() {
		return publishing;
	}
	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getBookshelves() {
		return bookshelves;
	}
	public void setBookshelves(int bookshelves) {
		this.bookshelves = bookshelves;
	}
	public int getNumberOfBooks() {
		return numberOfBooks;
	}
	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}
	public UUID ISBN;
	public String nameOfBook;
	public String author;
	public String publishing;
	public int year;
	public int bookshelves;
	public int numberOfBooks;
	
			
	public Books() {
		ISBN = UUID.randomUUID();
		nameOfBook = "";
		author = "";
		publishing = "";
		year = 0;
		bookshelves = 0;
		numberOfBooks = 0;
	}
	public Books(UUID ISBN, String NameOfBook, String Author, String Publishing, int Year, int Bookshelves, int NumberOfBooks) {
		this.ISBN = ISBN;
		this.nameOfBook = NameOfBook;
		this.author = Author;
		this.bookshelves = Bookshelves;
		this.numberOfBooks = NumberOfBooks;
		this.publishing = Publishing;
		this.year = Year;
		
	}
}
