package org.generation.italy.eventi;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Evento ev = new Evento("sagra della polpetta", LocalDate.now(), 50, 20);
		
		System.out.println(ev);
		
		System.out.println("--------------------------");
		ev.setTitle("Sagra della polpetta di castrignano del capo provincia di belluno");
		ev.setDate(LocalDate.parse("3000-12-13"));
		System.out.println(ev);

	}
	
}
