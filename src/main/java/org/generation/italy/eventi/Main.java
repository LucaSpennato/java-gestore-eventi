package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ProgrammaEventi progEv = null;
		Evento ev = null;
		Scanner sc = null;
		
		try {
			
			progEv = new ProgrammaEventi("Estate paxxa");
			
			progEv.addEvent(new Evento("sagra", LocalDate.now(), 50));
			progEv.addEvent(new Evento("concerto", LocalDate.now(), 20));
			progEv.addEvent(new Evento("ammaccabanane", LocalDate.now(), 50));

			System.out.println(progEv.getEventsCount());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
//			try {
//				sc = new Scanner(System.in);
//				
//				System.out.println("Inserisci un nuovo evento:");
//				System.out.print("Nome: ");
//				String evName = sc.next();
//				
//				System.out.println("Data (formato Anno-mese-giorno: ");
//				String date = sc.next();
//				LocalDate evDate = LocalDate.parse(date);
//				
//				System.out.print("Posti disponibili nell'evento: ");
//				int evSeats = sc.nextInt();
//				
//				ev = new Evento(evName, evDate, evSeats);
//						
//				System.out.println("Evento: ---------------------------");
//				System.out.println(ev);
//				
//				
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			} 
			
			// Milestone 2
//			Scanner scn = new Scanner(System.in);
//			while (true) {
//				System.out.println("Vuoi aggiungere o rimuovere prenotazioni? y/n");
//				String isMod = scn.next();
//				isMod.trim().toLowerCase();
//				if(isMod.equals("y")) {
//					System.out.println("1-Aggiungi prenotazioni\n2-RimuoviPrenotazioni\nPremi qualsiasi numero per tornare al menù precedente.");
//					System.out.println("-------");
//					System.out.println("Posti attualmente disponibili: " + ev.getTotalSeats()
//					+ "\nPosti attualmente prenotati: " + ev.getBookedSeats());
//					System.out.println("-------");
//					int bookingMng = scn.nextInt();
//					
//					if(bookingMng == 1) {
//						
//						System.out.println("Quante prenotazioni desidera aggiungere?");
//						
//						
//						int seatsToBook = scn.nextInt();
//						
//						
//							try {
//								for (int i = 0; i < seatsToBook; i++) {
//									
//									ev.bookASeat();
//									
//								}
//							} catch (Exception e) {
//								System.out.println(e.getMessage());
//								continue;
//							}
//						
//						continue;
//						
//					}else if(bookingMng == 2) {
//						System.out.println("Quanti posti desidera cancellare?");
//						int resToRemove = scn.nextInt();
//						
//						try {
//							for (int i = 0; i < resToRemove; i++) {
//								
//								ev.cancelReservation();
//								
//							}
//						} catch (Exception e) {
//							System.out.println(e.getMessage());
//							continue;
//						}
//						
//						continue;
//					}else {
//						System.out.println("Tornato al menù precedente.");
//						continue;
//					}
//					
//				}else {
//					break;
//				}
//			}
//			
//			scn.close();
//			sc.close();
	}
	
}
