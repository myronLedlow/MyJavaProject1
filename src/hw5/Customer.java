package hw5;

public class Customer {

	// Fields

private String first;
private String last;
private String email;

/**
 * Constructor for Customer
 * @param first
 * @param last
 * @param email
 */
public Customer(String first, String last, String email) {
	this.setFirst(first);
	this.setLast(last);
	this.setEmail(email);
}

// Getters and Setters

public String getFirst() {
	return first;
}

public void setFirst(String first) {
	this.first = first;
}

public String getLast() {
	return last;
}

public void setLast(String last) {
	this.last = last;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

// My toString() method for Customer
public String CustomerDisplay() {
	return "First Name:" + " " +  this.getFirst() + ", " + "Last Name:" + " " + this.getLast() + ", " + "Email:" + " " + this.getEmail();
}

}
