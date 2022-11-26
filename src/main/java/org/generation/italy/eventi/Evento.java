package org.generation.italy.eventi;

import java.time.LocalDate;

public class Evento {

	private String title;
	private LocalDate date;
	private int totalSeats;
	private int bookedSeats;
	
	public Evento(String title, String date, int totalSeats) throws Exception {
		
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
	public void setDate(String date) throws Exception {
		
		LocalDate d = LocalDate.parse(date);
		
		if(d.isBefore(LocalDate.now())) {
			throw new Exception("La data non può essere passata.");
		}
		this.date = d;
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
	
	public void bookASeat() throws Exception {
		if(totalSeats == 0) {
			throw new Exception("Non ci sono più posti disponibili.");
		}else if(LocalDate.now().isAfter(date)) {
			throw new Exception("L'evento è già terminato!");
		}
		bookedSeats++;
		totalSeats--;
	}
	
	public void cancelReservation() throws Exception {
		if(bookedSeats == 0) {
			throw new Exception("Non ci sono posti prenotati.");
		}else if(LocalDate.now().isAfter(date)) {
			throw new Exception("L'evento è già terminato!");
		}
		bookedSeats--;
		totalSeats++;
	}
	
	public boolean equals(Evento ev) {
		
		if(getTitle() == ev.getTitle() 
			&& getDate().isEqual(ev.getDate())
			) return true;
		
		return false;
	}
	
	@Override
	public String toString() {

		return "Title: " + getTitle()
				+ "\nDate: " + getDate();
	}
	
}
