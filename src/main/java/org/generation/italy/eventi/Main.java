package org.generation.italy.eventi;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Crea una lista di eventi.\nNome della lista: ");
		String listName = sc.next();
		ProgrammaEventi progEv = new ProgrammaEventi(listName);

		while(true) {
			
			try {
				
				System.out.println("Vuoi aggiungere un evento alla lista di eventi? y/n");
				System.out.println("Numero eventi presenti: " + progEv.getEventsCount());
				String wantToAddEvent = sc.next();
				wantToAddEvent.trim().toLowerCase();
				
				if(wantToAddEvent.equals("y")) {
					
					System.out.println("Che tipo di evento?\n1. Concerto\n2. Generico");
					int eventType = sc.nextInt();
					
					
					System.out.println("Nome evento: ");
					String evName = sc.next();
					
					System.out.println("Data evento: (aaaa-mm-gg)");
					String evDate = sc.next();
					
					System.out.println("Posti evento: ");
					int evSeats = sc.nextInt();
					
					if(eventType == 1) {
						System.out.println("Inserisci data: (hh:mm:ss)");
						String evHour = sc.next();
						
						System.out.println("Inserisci prezzo: ");
						String evPrice = sc.next();
						
						progEv.addEvent(new Concerto(evName, evDate, evSeats, evHour, evPrice));
					}
					else {
						progEv.addEvent(new Evento(evName, evDate, evSeats));						
					}
						
					continue;
				}else {
					break;
				}
				
			} catch (Exception e) {
				System.err.println(e.getMessage());
				continue;
			}
		}
		
		List<String> progEvList = progEv.getProgrammaEventi();
		
		// Milestone 2
		Evento ev = null;
		while (true && progEv.getEventsCount() > 0) {
			
			System.out.println("Vuoi aggiungere o rimuovere prenotazioni? y/n");
			String isChangingSeats = sc.next();
			isChangingSeats.trim().toLowerCase();
			
			
			if(isChangingSeats.equals("y")) {
				System.out.println("Per quale evento?");
				
				for (int i = 0; i < progEvList.size(); i++) {
					
					String p = progEvList.get(i);
					
					if(!p.equals(progEv.getTitle())) {
						System.out.println(i + ". " + p + "\n");				
					}
					
				}
				
				int userSelectedEvent = sc.nextInt();
				
				try {
					ev = progEv.getExactEvento(userSelectedEvent - 1);
				} catch (Exception e) {
					System.err.println(e.getMessage());
					continue;
				}
				
				System.out.println("1-Aggiungi prenotazioni\n2-RimuoviPrenotazioni\nPremi qualsiasi numero per tornare al menù precedente.");
				System.out.println("-------");
				System.out.println("Posti attualmente disponibili: " + ev.getTotalSeats()
				+ "\nPosti attualmente prenotati: " + ev.getBookedSeats());
				System.out.println("-------");
				int bookingMng = sc.nextInt();
				
				if(bookingMng == 1) {
					
					System.out.println("Quante prenotazioni desidera aggiungere?");
					
					
					int seatsToBook = sc.nextInt();
					
					
						try {
							for (int i = 0; i < seatsToBook; i++) {
								
								ev.bookASeat();
								
							}
						} catch (Exception e) {
							System.out.println(e.getMessage());
							continue;
						}
					
					continue;
					
				}else if(bookingMng == 2) {
					System.out.println("Quanti posti desidera cancellare?");
					int resToRemove = sc.nextInt();
					
					try {
						for (int i = 0; i < resToRemove; i++) {
							
							ev.cancelReservation();
							
						}
					} catch (Exception e) {
						System.out.println(e.getMessage());
						continue;
					}
					
					continue;
				}else {
					System.out.println("Tornato al menù precedente.");
					continue;
				}
				
			}else {
				break;
			}
		}
		
		sc.close();

		System.out.println("La tua lista eventi: \n");
		
		for (int i = 0; i < progEvList.size(); i++) {

			String p = progEvList.get(i);
			
			if(p.equals(progEv.getTitle())) {
				System.out.println(p + ":" + "\n");
			}else {
				System.out.println("\t" + i + ". " + p);				
			}
			
		}
	}
	
}
