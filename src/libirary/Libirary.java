package libirary;

import java.util.Scanner;

public class Libirary {

	void CheckOutBook() {
		int NumberOfAvaialblesCopies = 0;
		System.out.println("Please enter book title to be checked out! ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String bookCheckedOut = input.next();
		if (Book.contains(bookCheckedOut)) {
			if (NumberOfAvaialblesCopies > 1) {
				NumberOfAvaialblesCopies = NumberOfAvaialblesCopies - 1;

				System.out.println("  " + bookCheckedOut + " has been checked out!");
				System.out.println(" Don't forget to return " + bookCheckedOut + "in 14 days!");
			} else
				System.out.println("  " + bookCheckedOut + " has been checked out!");
			System.out.println(" Don't forget to return " + bookCheckedOut + "in 14 days!");
			System.out.println("This is the last copy");
		} else
			System.out.println(bookCheckedOut + "is not avaliable in our libirary unfortunately. Try A new book!");

	}

	void CheckInBook() {
		int NumberOfAvaialblesCopies = 0;
		System.out.println("Please enter book title to be checked in! ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String bookCheckedIn = input.next();
		if (Book.contains(bookCheckedIn)) {
			NumberOfAvaialblesCopies = NumberOfAvaialblesCopies + 1;
			System.out.println(bookCheckedIn + "has been checked in! ");

		} else
			Book.add(bookCheckedIn);
		System.out.println(bookCheckedIn +" "+ "has been checked in! ");
	}

	
	
	

	public static void main(String[] args) {
		
		Libirary newbook = new Libirary();
		
		newbook.CheckInBook();
		newbook.CheckOutBook();
	}
	
}
