package org.generation.italy.eventi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Concerto extends Evento {

	private LocalTime hour;
	private BigDecimal price;
	
	public Concerto(String title, LocalDate date, int totalSeats) throws Exception {
	
		super(title, date, totalSeats);
		
		setHour(hour);
		setPrice(price);
	}

	public LocalTime getHour() {
		return hour;
	}
	private void setHour(LocalTime hour) {
		this.hour = hour;
	}

	public float getPrice() {
		return price.floatValue();
	}
	private void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	@Override
	public String toString() {

		return super.toString()
				+ "\nHour: " + getHour()
				+ "\nPrice: " + getPrice() + "$";
	}
	
}
