package org.generation.italy.eventi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento {

	private LocalTime hour;
	private BigDecimal price;
	
	public Concerto(String title, LocalDate date, int totalSeats, LocalTime hour, String price) throws Exception {
	
		super(title, date, totalSeats);
		
		setHour(hour);
		setPrice(price);
	}

	public LocalTime getHour() {
		return hour;
	}
	private void setHour(LocalTime hour) {
		
		DateTimeFormatter f = DateTimeFormatter.ISO_TIME;
		
		hour.format(f);
		
		this.hour = hour;
	}

	public float getPrice() {
		return price.floatValue();
	}
	private void setPrice(String price) {
		this.price = new BigDecimal(price);
	}
	
	@Override
	public String toString() {

		return super.toString()
				+ "\nHour: " + getHour()
				+ "\nPrice: " + getPrice() + "$";
	}
	
}
