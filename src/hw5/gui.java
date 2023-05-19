package hw5;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
//import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;
public class gui  implements ActionListener  {
	
	// Create JFrame
JFrame frame;




/**
Customer customer1 = new Customer("John", "Stamos", "jstamos@yahoo.com");
Customer customer2 = new Customer("John", "Wayne", "jwayne@yahoo.com");
Customer customer3 = new Customer("Jimmy", "Hendrix", "jhendrix@yahoo.com");
Customer customer4 = new Customer("Bob", "Dylan", "bdylan@yahoo.com");
Customer customer5 = new Customer("John", "Denver", "jdenver@yahoo.com");
Customer customer6 = new Customer("Robert", "Plant", "rplant@yahoo.com");
Customer customer7 = new Customer("John", "Bonham", "jbonham@yahoo.com");
Customer customer8 = new Customer("Keith", "Richards", "krichards@yahoo.com");
Customer customer9 = new Customer("Willie", "Nelson", "wnelson@yahoo.com");
Customer customer10 = new Customer("Jimmy", "Page", "jpage@yahoo.com");
Customer customer11 = new Customer("George", "Carlin", "gcarlin@yahoo.com");
Customer customer12 = new Customer("Tim Blake", "Nelson", "tnelson@gmail.com");




Book book1 = new Book("The Red Badge of Courage", "Stephen Crane", 200, "Penguin Books", 20);
Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger", 240, "Penguin Books", 10);
Book book3 = new Book("1001 Nights", "Various Authors", 750, "Penguin Books", 5);
Book book4 = new Book("The Basketball Diaries", "Jim Carrol", 195, "Penguin Books", 3);
Book book5 = new Book("This Blinding Absence of Light", "Tahar Bin Jalloun", 235, "Penguin Books", 7);
Book book6 = new Book("The Hobbit", "J.K. Tolkien", 180, "Penguin Books", 4);
Book book7 = new Book("Alice in Wonderland", "Lewis Carroll", 190, "Penguin Books", 9);
Book book8 = new Book("Siddhartha", "Herman Hesse", 175, "Penguin Books", 6);
Book book9 = new Book("Go Now", "Richard Hell", 195, "Penguin Books", 2);
Book book10 = new Book("Secondhand Souls", "Christopher Moore", 240, "Penguin Books", 3);
RentedBook rental1 = new RentedBook("Hendrix","The Red Badge of Courage", "Stephen Crane", 200, "Penguin Books", 20);
RentedBook rental2 = new RentedBook("Dylan","The Catcher in the Rye", "J.D. Salinger", 240, "Penguin Books", 10);
RentedBook rental3 = new RentedBook("Denver","Alice in Wonderland", "Lewis Carroll", 190, "Penguin Books", 9);

*/

// Create ArrayLists of type Customer, Book, RentedBook

ArrayList<Customer> cList = new ArrayList<Customer>();
ArrayList<Book> bList = new ArrayList<Book>();
ArrayList<RentedBook> rentals = new ArrayList<RentedBook>();







	
// Constructor for gui

public gui() {
	frame = new JFrame("Book Store");
	frame.setPreferredSize(new Dimension(1100,1100));
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
}

// Add Menu Bar to Frame

public void createAndAddMenuBar() {
	JMenuBar myMenuBar = new JMenuBar();
	myMenuBar.setOpaque(true);
	myMenuBar.setBackground(new Color(0,0,255));
	myMenuBar.setPreferredSize(new Dimension(50,50));
	frame.setJMenuBar(myMenuBar);
}

// Add Buttons to this frame

// Read from Files

// Convert contents of files to objects of type Customer, Book, RentedBook 

public void createAndAddButton() {
	
	try {
		File file1 = new File("customer_input.txt");
		Scanner in = new Scanner(file1); 
		String first;
		String last;
		String email;
		File file2 = new File("books_input.txt");
		Scanner books_in = new Scanner(file2);
		String title;
		String author; 
		int numpages;
		String publisher;
		int numcopies;
	    
		
		String[] Customer;
		
		String line = "";
		while (in.hasNextLine()) {
			line = in.nextLine();
			Customer = line.split(", ");
			first = Customer[0];
		    last = Customer[1];
			email = Customer[2];
			Customer c = new Customer(first, last, email);
			
			cList.add(c);
		}
		
		String [] Book;
		String line2 = "";
		while (books_in.hasNextLine()) {
			line2 = books_in.nextLine();
			Book = line2.split(", ");
			title = Book[0];
		    author = Book[1];
			numpages = Integer.parseInt(Book[2]);
			publisher = Book[3];
			numcopies = Integer.parseInt(Book[4]);
			Book b = new Book(title, author, numpages, publisher, numcopies);
			
			bList.add(b);
		}
		
		
			File file = new File("rent_input.txt");	
			Scanner rentals_in = new Scanner(file); 
			String rent_name;
			String rent_title;
			String rent_author;
		    
			
			String[] rentingCustomer;
			
			String line3 = "";
			while (rentals_in.hasNextLine()) {
				line3 = rentals_in.nextLine();
				rentingCustomer = line3.split(", ");
				rent_name = rentingCustomer[0];
			    rent_title = rentingCustomer[1];
				rent_author = rentingCustomer[2];
				RentedBook r = new RentedBook(rent_name, rent_title ,rent_author, 0,"",0);
				r.setRentname(rent_name);
				rentals.add(r);
			}
			
			
			
		
		
		
		in.close();
		books_in.close();
		rentals_in.close();
	} catch(FileNotFoundException f) {
		f.printStackTrace();
	}
		
	
	
	/**
	
	cList.add(customer1);
	cList.add(customer2);
	cList.add(customer3);
	cList.add(customer4);
	cList.add(customer5);
	cList.add(customer6);
	cList.add(customer7);
	cList.add(customer8);
	cList.add(customer9);
	cList.add(customer10);
	cList.add(customer11);
	cList.add(customer12);

	bList.add(book1);
	bList.add(book2);
	bList.add(book3);
	bList.add(book4);
	bList.add(book5);
	bList.add(book6);
	bList.add(book7);
	bList.add(book8);
	bList.add(book9);
	bList.add(book10);
	
	
	*/
	
	
	
	JButton btn1 = new JButton("Customers");
	btn1.setActionCommand("Customers");
	btn1.setSize(25, 25);
	JButton btn2 = new JButton("Books");
	btn2.setActionCommand("Books");
	btn2.setSize(25, 25);
	
	btn1.addActionListener(this);
	btn2.addActionListener(this);
	
	
	frame.getContentPane().add(btn1,BorderLayout.WEST);
	frame.getContentPane().add(btn2, BorderLayout.CENTER);
	JButton btn3 = new JButton("Show all rentals");
	//btn3.setSize(25, 25);
	btn3.setActionCommand("Show all rentals");
	btn3.addActionListener(this);
	
	JButton btn4 = new JButton("Search for customers");
	btn4.setActionCommand("Search for customers");
	btn4.addActionListener(this);
	
	
	/**
	
	*/
	frame.getContentPane().add(btn3, BorderLayout.EAST);
	
	JButton btn5 = new JButton("Search for books");
	btn5.setActionCommand("Search for books");
	btn5.addActionListener(this);
	frame.getContentPane().add(btn4, BorderLayout.NORTH);
	frame.getContentPane().add(btn5, BorderLayout.SOUTH);
	
		
	
	
	
	//frame.getContentPane().add(btn5, FlowLayout.TRAILING);
	
}


// Actions for when the buttons are pressed

public void actionPerformed(ActionEvent e) {
	
	// "If this button is pushed" conditionals
	if("Customers".contentEquals(e.getActionCommand())) {
		//JOptionPane.showMessageDialog(null,"Here's the list of Customers : ");
		
		
		// Create another frame for showing customers
		
		JLabel custLabel = new JLabel("");
		custLabel.setBackground(new Color(255,255,255));
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255,255,255));
		
		JFrame custFrame = new JFrame("List of all customers");
		custFrame.add(panel, BorderLayout.CENTER);
		
		custFrame.setPreferredSize(new Dimension(700,700));
		
		custFrame.setBackground(new Color(0,0,255));
		custFrame.pack();
		for(Customer item: cList) {

			
			
			custLabel  = new JLabel(item.CustomerDisplay());
			//JOptionPane.showMessageDialog(null, custLabel);
			custLabel.setOpaque(true);
			panel.add(custLabel);
			panel.setVisible(true);
			panel.setPreferredSize(new Dimension(900,900));
			
			
			
			
			
		}
		
		custFrame.setVisible(true);
		
		
		
		//JOptionPane.showInputDialog("Enter Last Name  of customer");
		//String custLast = textfield.getText();
		//JOptionPane.showMessageDialog(null,"is Currently Rented out by " + custLast );
		
	}
	if("Books".contentEquals(e.getActionCommand())) {
		//JOptionPane.showMessageDialog(null,"Here's the list of Books : ");
		
		// Create another frame for displaying Books
		
		
		JLabel custLabel = new JLabel("");
		custLabel.setBackground(new Color(0,0,0));
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255,255,255));
		
		JFrame bookFrame = new JFrame("List of all books");
		bookFrame.add(panel, BorderLayout.CENTER);
		
		bookFrame.setPreferredSize(new Dimension(900,900));
		bookFrame.setBackground(new Color(0,0,255));
		bookFrame.pack();
		for(Book item: bList) {
			
			custLabel  = new JLabel(item.BookDisplay());
			//JOptionPane.showMessageDialog(null, custLabel);
			custLabel.setOpaque(true);
			panel.add(custLabel);
			panel.setVisible(true);
			panel.setPreferredSize(new Dimension(200,150));
			
			}
		
		bookFrame.setVisible(true);
		
		
	}
	
	if ("Search/Add/Remove Rentals".contentEquals(e.getActionCommand())) {
		
		JLabel custLabel = new JLabel("");
		custLabel.setBackground(new Color(0,0,0));
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255,255,255));
		
		//JFrame bookFrame = new JFrame("Rentals");
		//bookFrame.add(panel, BorderLayout.CENTER);
		
		//bookFrame.setPreferredSize(new Dimension(500,500));
		
	String input = JOptionPane.showInputDialog("Enter the last name of the customer: ");
	JFrame custFrame = new JFrame("Rental");
	custFrame.add(panel, BorderLayout.NORTH);

	
	
	
	custFrame.setPreferredSize(new Dimension(900,900));
	custFrame.setBackground(new Color(0,0,255));
	
	
	for(RentedBook item: rentals) {
		 custLabel = new JLabel(item.RentalDisplay());
		if(item.getRentname().toLowerCase().equals(input.toLowerCase())) {
			//JOptionPane.showMessageDialog(null,"Current Rental under " + item.RentalDisplay());
			
				
				 custLabel.setOpaque(true);
				 panel.add(custLabel);	
					
				 panel.setVisible(true);
				 panel.setPreferredSize(new Dimension(200,150));
					
					
			
		}
		
		

		
		
			}
	
	custFrame.add(panel);
	
	custFrame.pack();
	custFrame.setVisible(true);

	
	
	// Add some buttons to this frame
	
	
	JButton btn6 = new JButton("Add rental");
	btn6.setActionCommand("Add rental");
	btn6.addActionListener(this);
	btn6.setSize(50, 50);
	btn6.setBounds(10, 10, 10, 10);
	
	custFrame.getContentPane().add(btn6, BorderLayout.EAST);
	
	JButton btn7 = new JButton("Remove rental");
	btn7.setActionCommand("Remove rental");
	btn7.addActionListener(this);
	btn7.setSize(50,50);
	btn7.setBounds(10,10,10,10);
	custFrame.getContentPane().add(btn7, BorderLayout.WEST);
	
	
	custFrame.pack();
	custFrame.setVisible(true);
	//in.close();
		
		
	}
	
	if("Search for customers".contentEquals(e.getActionCommand())){
		
		
		
		
		String input = JOptionPane.showInputDialog("Enter the last name of the customer: ");
		
		
		
		JLabel custLabel = new JLabel("");
		custLabel.setBackground(new Color(0,0,0));
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255,255,255));
		
		JFrame custFrame = new JFrame("Customer");
		
		custFrame.add(panel, BorderLayout.CENTER);
		
		custFrame.setPreferredSize(new Dimension(900,900));
		custFrame.setBackground(new Color(0,0,255));
		custFrame.pack();
		
		for(Customer item: cList) {
			if(item.getLast().toLowerCase().equals(input.toLowerCase())) {
				 custLabel = new JLabel(item.CustomerDisplay());
				 custLabel.setOpaque(true);
					panel.add(custLabel);
					panel.setVisible(true);
					panel.setPreferredSize(new Dimension(200,150));
					custFrame.setVisible(true);
			}
			
				
				}
			
		
	}
	
	if("Search for books".contentEquals(e.getActionCommand())){
		
		
		
		
		String input = JOptionPane.showInputDialog("Enter the title of the book: ");
		JLabel custLabel = new JLabel("");
		custLabel.setBackground(new Color(0,0,0));
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255,255,255));
		
		JFrame custFrame = new JFrame("Book");
		custFrame.add(panel, BorderLayout.CENTER);
		
		custFrame.setPreferredSize(new Dimension(900,900));
		custFrame.setBackground(new Color(0,0,255));
		
		custFrame.pack();
		
		for(Book item: bList) {
			if(item.getTitle().toLowerCase().equals(input.toLowerCase())) {
				 custLabel = new JLabel(item.BookDisplay());
				 custLabel.setOpaque(true);
					panel.add(custLabel);
					panel.setVisible(true);
					panel.setPreferredSize(new Dimension(200,150));
					custFrame.setVisible(true);
			}
			
		}	
				
			
		
		}
	
	
	if("Add rental".contentEquals(e.getActionCommand())) {
		
		
String addInput = JOptionPane.showInputDialog("Do you want to add a rental? : ");

JLabel custLabel = new JLabel("");

custLabel.setBackground(new Color(0,0,0));
JPanel panel = new JPanel();
panel.setBackground(new Color(255,255,255));

JFrame bookFrame = new JFrame("Rentals");
bookFrame.add(panel, BorderLayout.CENTER);

bookFrame.setPreferredSize(new Dimension(500,500));
bookFrame.setBackground(new Color(0,0,255));

bookFrame.pack();


bookFrame.setVisible(true);
		if(addInput.toLowerCase().equals("Yes".toLowerCase())) {
			
				
			String nameInput = JOptionPane.showInputDialog("Enter the last name of the customer: ");
			String titleInput = JOptionPane.showInputDialog("Enter the title of the book: ");
			String authorInput = JOptionPane.showInputDialog("Enter the author of the book: ");
			RentedBook newRental = new RentedBook(nameInput,titleInput,authorInput,0, "Penguin Books",0);
			newRental.setRentname(nameInput);
			rentals.add(newRental);
			try {
				// File file = new File("/Users/sakhrthewise/Desktop/rent_input.txt");
				 File file2 = new File("/Users/sakhrthewise/Desktop/rent_input.txt");
					//Scanner in = new Scanner(file); 
					FileWriter out = new FileWriter(file2);
					
			for(RentedBook item: rentals) {
				
				custLabel  = new JLabel(item.RentalDisplay());
				//JOptionPane.showMessageDialog(null, custLabel);
				
				
				
				
			 
			
				 
					
						
				

						
				 
						 
							out.write(item.getRentname() + ", " + item.getTitle() + ", " + item.getAuthor() + "\n");
														
							
							
							
			}
			
			custLabel.setOpaque(true);
			panel.add(custLabel);
			panel.setVisible(true);
			panel.setPreferredSize(new Dimension(200,150));
			bookFrame.setVisible(true);
				 
						
						out.close();
						
			
				 
				 } catch (IOException e1) {
						
						e1.printStackTrace();
					}

				 
				 
				
				 
		}				 
			
				 
			
			 
	}
	

	if("Remove rental".contentEquals(e.getActionCommand())) {
		
		
String removeInput = JOptionPane.showInputDialog("Do you want to remove a rental? : ");

JLabel custLabel = new JLabel("");

custLabel.setBackground(new Color(0,0,0));
JPanel panel = new JPanel();
panel.setBackground(new Color(255,255,255));

JFrame bookFrame = new JFrame("Rentals");
bookFrame.add(panel, BorderLayout.CENTER);

bookFrame.setPreferredSize(new Dimension(500,500));
bookFrame.setBackground(new Color(0,0,255));
bookFrame.pack();


bookFrame.setVisible(true);
		
		if(removeInput.toLowerCase().equals("Yes".toLowerCase())) {
			
				
			String nameInput = JOptionPane.showInputDialog("Enter the last name of the customer: ");
			String titleInput = JOptionPane.showInputDialog("Enter the title of the book: ");
			//String authorInput = JOptionPane.showInputDialog("Enter the author of the book: ");
			
			//RentedBook newRental = new RentedBook(nameInput,"", "",0, "Penguin Books",0);
			
			//newRental.setRentname(nameInput);
			
			//newRental.setTitle(titleInput);
			//newRental.setAuthor(authorInput);
			
			
			//rentals.add(newRental);
			
			try {
				
				// File file = new File("/Users/sakhrthewise/Desktop/rent_input.txt");
				 File file2 = new File("/Users/sakhrthewise/Desktop/rent_input.txt");
					Scanner in = new Scanner(file2); 
					FileWriter out = new FileWriter(file2);
				
			for(RentedBook item: rentals) {
				if(item.getRentname().toLowerCase().equals(nameInput.toLowerCase()) && (item.getTitle().toLowerCase().equals(titleInput.toLowerCase())))  {
					rentals.remove(item);
				}
			}
			
			for (RentedBook item: rentals) {
			
			
				
				
					custLabel  = new JLabel(item.RentalDisplay());
				
				//JOptionPane.showMessageDialog(null, custLabel);
				
				
				
				
			 
			
				 
					
						
				

						
				 
						 
							out.write(item.getRentname() + ", " + item.getTitle() + ", " + item.getAuthor() + "\n");
												
					
			}				
							
			
			
			
			custLabel.setOpaque(true);
			panel.add(custLabel);
			panel.setVisible(true);
			panel.setPreferredSize(new Dimension(200,150));
			bookFrame.setVisible(true);
				 
						in.close();
						out.close();
						
			
				 
				 } catch (IOException e1) {
						
						e1.printStackTrace();
					}

				 
				 
				
				 
		}				 
			
				 
			
			 
			 
		
			
	}
	
	if("Show all rentals".contentEquals(e.getActionCommand())) {
		//JOptionPane.showMessageDialog(null,"Here's the list of Books : ");
		
		// Create a new frame for displaying Rentals
		
		JFrame rentFrame = new JFrame("List of all rentals");
		
		JPanel rentPanel = new JPanel();
		
		JButton btn8 = new JButton("Search/Add/Remove Rentals");
		btn8.setActionCommand("Search/Add/Remove Rentals");
		btn8.addActionListener(this);
		//btn8.setSize(new Dimension(200,200));
		//btn8.setBounds(0,150,250,250);
		rentPanel.add(btn8);
		
		
		rentFrame.getContentPane().add(rentPanel, BorderLayout.NORTH);
		
		
		
		
		
		JLabel custLabel = new JLabel("");
		custLabel.setBackground(new Color(0,0,0));
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255,255,255));
		
		
		
		
		rentFrame.setPreferredSize(new Dimension(700,700));
		rentFrame.setBackground(new Color(0,0,255));
		rentFrame.add(panel, BorderLayout.CENTER);
		
		for(RentedBook item: rentals) {
			
			custLabel  = new JLabel(item.RentalDisplay());
			
			
			panel.setPreferredSize(new Dimension(900,900));
			//JOptionPane.showMessageDialog(null, custLabel);
			panel.add(custLabel);
			panel.setVisible(true);
			panel.setOpaque(true);
			
			}
		
		//custLabel.setOpaque(true);
		
		rentFrame.setVisible(true);
		rentFrame.pack();
		
		
		
		
		
		
	}
			 
	
		
	
	
}
 
// Call methods to build the GUI

public void createAndShowGUI() {
	createAndAddMenuBar();
	
	createAndAddButton();
	
	frame.pack();
	
	frame.setVisible(true);
	frame.setBackground(new Color(0,0,255));
	
}

// Main Method 
// Create object of type gui
// Call Runnable
// Display GUI
public static void main(String[]args)  {
	gui gui = new gui();
	javax.swing.SwingUtilities.invokeLater(new Runnable(){
		public void run() {
			gui.createAndShowGUI();
		}
	});
	
	
}




}
