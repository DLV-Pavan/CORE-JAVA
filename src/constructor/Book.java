package constructor;

public class Book {
	int id;
	String title;
	String author;
	double price;
	
	public Book() {
		id = 101;
		title = "Java programming";
		author = "James Gosling";
		price = 650;
	}
	
	public void display() {
		System.out.println("book id: "+ id);
		System.out.println("Title: "+ title);
		System.out.println("Price: "+ price);
		System.out.println("Author: "+ author);
	}
	
	public static void main(String args[]) {
		Book b1 = new Book();
		b1.display();

		
	}

}
