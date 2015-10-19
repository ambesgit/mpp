package lab10;

import java.util.ArrayList;
import java.util.List;

public class ProblemNine {

	public static void main(String[] args) {
		Book book=new Book("test",3);
		List<BookCopy> copies=book.getCopies();
		copies.forEach(copy->copy.changeAvailability());
		
		//test
		System.out.println(book.getCopies().stream().filter(n->n.isAvailable()).map(n->1).reduce(0,(a,b)->a+b));

	}

}
class Book {
	private List<BookCopy> copies = new ArrayList<BookCopy>();
	private String title;
	public Book(String title, int numCopies) {
		if(numCopies < 1) throw new IllegalArgumentException(
				"NumCopies must be positive");
		this.title= title;
		for(int i = 0; i < numCopies; ++i) {
			addCopy();
		}
	}
	public List<BookCopy> getCopies() {
		return copies;
	}
	public void addCopy() {
		BookCopy copy = new BookCopy(this, copies.size() + 1, true);
		copies.add(copy);
	}
}
class BookCopy {
	private Book book;
	private int copyNum;
	private boolean isAvailable;
	public BookCopy(Book book, int copyNum, boolean isAvailable) {
		this.book = book;
		this.copyNum = copyNum;
		this.isAvailable = isAvailable;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void changeAvailability() {
		isAvailable = !isAvailable;
	}
}
