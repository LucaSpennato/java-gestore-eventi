package org.generation.italy.eventi;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Evento ev = null;
		
		try {
			ev = new Evento("sagra della polpetta", LocalDate.now(), 20);
			System.out.println(ev);
			
			System.out.println("--------------------------");
			ev.setTitle("Sagra della polpetta di castrignano del capo provincia di belluno");
			ev.setDate(LocalDate.parse("3000-12-13"));
			System.out.println(ev);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("-------------");
		System.out.println(ev);
		System.out.println("--------------------------");
		
		
		try {
			for (int i = 0; i < 20; i++) {
				ev.bookASeat();
			}
			ev.bookASeat();
			System.out.println(ev);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}					


	}
	
}
