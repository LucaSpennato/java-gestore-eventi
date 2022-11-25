package org.generation.italy.eventi;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento {

	private LocalTime hour;
	private BigDecimal price;
	
	public Concerto(String title, String date, int totalSeats, String hour, String price) throws Exception {
	
		super(title, date, totalSeats);
		
		setHour(hour);
		setPrice(price);
	}

	public LocalTime getHour() {
		return hour;
	}
	private void setHour(String hour) {
		
		LocalTime h = LocalTime.parse(hour);
		DateTimeFormatter f = DateTimeFormatter.ISO_TIME;
		
		h.format(f);
		
		this.hour = h;
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
