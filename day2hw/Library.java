package week1.day2hw;

public class Library {
	public String bookTitle() {
		System.out.println("Book added successfully");
		return "Ikigai";
	}

	public void issueBook() {
	System.out.println("Book issued successfully");
}

	public static void main(String[] args) {
	Library lib = new Library();
	String libone = lib.bookTitle();
	System.out.println("Book Title: " + libone);
	lib.issueBook();
	}
}
