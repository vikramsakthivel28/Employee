package oops3;

public interface UseBook {
	public static void main (String[]args) {
		Book b = new Book1();
		System.out.println(b.displayPrice(1000));
		System.out.println(b.displayAuthor("Author"));
		System.out.println(b.displayPublication("publication"));
		System.out.println(b.getGenre("genre"));
		
		
	}

}
interface Book { 
	public int displayPrice (int price);
	public String displayAuthor (String author);
	public String displayPublication (String publication);
	public String getGenre (String genre);
}
class Book1 implements Book {
	public int displayPrice (int price) {
		return price;
	}
	public String displayAuthor (String author) {
		return author;
	}
	public String displayPublication (String publication) {
		return publication;
	}
	public String getGenre (String genre) {
		return genre;
	}
}