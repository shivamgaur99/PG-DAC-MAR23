package in.cdac.acts.test;

import java.util.Comparator;
import java.util.List;

import in.cdac.acts.domain.Book;

public class ListTest {
	private List<Book> bookList;

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	// Add Books
	public void addBooks(Book[] arr) {
		if (arr != null) {
			for (Book book : arr)
				this.bookList.add(book);
		}
	}

	// Add Single Book
	public void addBook(Book acceptBook) {
		if (this.bookList != null) {
			this.bookList.add(acceptBook);
			System.out.println("Added the book successfully!");
		} else
			System.out.println("Book not added.");
	}

	// find Books
	public Book findBook(int bookId) {
		if (this.bookList != null) {
			Book key = new Book();
			key.setId(bookId);
			if (this.bookList.contains(key)) {
				int index = this.bookList.indexOf(key);
				Book value = this.bookList.get(index);
				return value;
			}
		}
		return null;
	}

	// remove Books
	public boolean removeBook(int bookId) {
		if (this.bookList != null) {
			Book key = new Book();
			key.setId(bookId);
			if (this.bookList.contains(key)) {
				this.bookList.remove(key);
				return true;
			}
		}
		return false;
	}

	// print books
	public void printBooks() {
		this.bookList.forEach(System.out::println);
	}

	public void printBooks(Comparator<Book> comparator) {
		this.bookList.sort(comparator);
		this.bookList.forEach(System.out::println);
	}

}
