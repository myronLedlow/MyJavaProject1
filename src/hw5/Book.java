package hw5;

public class Book {
	
	// Fields
	private String title;
	private String author;
	private int numpages;
	private String publisher;
	private int copies;
	
	/**
	 * Constructor for Book
	 * @param title
	 * @param author
	 * @param numpages
	 * @param publisher
	 * @param copies
	 */
	
	public Book(String title, String author, int numpages, String publisher, int copies) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setNumpages(numpages);
		this.setPublisher(publisher);
		this.setCopies(copies);
	}

	// Getters and Setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumpages() {
		return numpages;
	}

	public void setNumpages(int numpages) {
		this.numpages = numpages;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	// My toString() method for Book
	public String BookDisplay() {
		return "Title:" + " " + this.getTitle() + ", " + "Author:" + " " + this.getAuthor() + ", "  +  "Number of pages:" + " " + this.getNumpages() + ", " + "Publisher:" + " " +  this.getPublisher() + ", " + "Number of copies:" + " " + this.getCopies();
	}

}
