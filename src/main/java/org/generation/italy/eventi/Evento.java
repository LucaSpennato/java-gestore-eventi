package org.generation.italy.eventi;

import java.time.LocalDate;

public class Evento {

	private String title;
	private LocalDate date;
	private int totalSeats;
	private int bookedSeats;
	
	public Evento(String title, LocalDate date, int totalSeats) throws Exception {
		
		setTitle(title);
		setDate(date);
		setTotalSeats(totalSeats);
		setBookedSeats(0);
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
	public void setDate(LocalDate date) throws Exception {
		if(date.isBefore(LocalDate.now())) {
			throw new Exception("La data non può essere passata.");
		}
		this.date = date;
	}
	
	public int getTotalSeats() {
		return totalSeats;
	}
	private void setTotalSeats(int totalSeats) throws Exception {
		if(totalSeats <= 0) {
			throw new Exception("I posti non possono essere minori di 0.");
		}
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
