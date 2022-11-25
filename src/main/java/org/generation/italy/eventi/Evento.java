package org.generation.italy.eventi;

import java.time.LocalDate;

public class Evento {

	private String title;
	private LocalDate date;
	private int totalSeats;
	private int bookedSeats;
	
	public Evento(String title, LocalDate date, int totalSeats, int bookedSeats) {
		
		setTitle(title);
		setDate(date);
		setTotalSeats(totalSeats);
		setBookedSeats(bookedSeats);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public int getTotalSeats() {
		return totalSeats;
	}
	private void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	
	public int getBookedSeats() {
		return bookedSeats;
	}
	private void setBookedSeats(int bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
	
	
	@Override
	public String toString() {

		return "Title: " + getTitle()
				+ "\nDate: " + getDate()
				+ "\nTotal seats: " + getTotalSeats()
				+ "\nBooked seats: " + getBookedSeats();
	}
	
}
