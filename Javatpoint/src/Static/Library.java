package Static;

public class Library {
	static class Book {
		void info() {
			System.out.println("Book updated.");
		}
	}

	public static void main(String[] args) {
		Book b = new Book();
		b.info();
	}
}
