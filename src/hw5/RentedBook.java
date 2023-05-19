package hw5;

public class RentedBook extends Book {
	
	// Fields
	private String rentname;
	
	/**
	 * Constructor for RentedBook
	 * @param rentname
	 * @param title
	 * @param author
	 * @param numpages
	 * @param publisher
	 * @param copies
	 */
	public RentedBook(String rentname,String title, String author, int numpages,String publisher, int copies) {
		super(title, author, numpages,publisher, copies);
	}

	// Getters and Setters
	
	public String getRentname() {
		return rentname;
	}

	public void setRentname(String rentname) {
		this.rentname = rentname;
	}
	
	// My toString() method for RentedBook
	public String RentalDisplay() {
		return "Rental under " + this.getRentname() + " | "  + "Book Title:" + " " + this.getTitle() + " | " + "Book Author:" + " " +  this.getAuthor();
	}

}
