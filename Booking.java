package test;

import java.util.Scanner;

public class Booking {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Book Your Ticket");
		System.out.println("2.Total Bookings");
		Booking run = new Booking();
		run.booking();
        //run.ViewBooking();
	}
	public void ViewBooking() {
		System.out.println("1. Book Your Ticket");
	}
	public void booking() {
		
		Booking sis = new Booking();
		
		int choice = sc.nextInt();
		choice = choice + 1;
		
		int total = choice++;
		System.out.println("Ticket Booked Successfully");
		switch(choice) {
		case 1:
			sis.booking();
			
		break;
		case 2:
			 System.out.println(total);
			break;
		
	}
	}

}
