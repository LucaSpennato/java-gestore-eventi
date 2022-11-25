package org.generation.italy.eventi;

import java.time.LocalDate;
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
					
					System.out.println("Nome evento: ");
					String evName = sc.next();
					
					System.out.println("Data evento: (aaaa-mm-gg)");
					String evDate = sc.next();
					
					System.out.println("Posti evento: ");
					int evSeats = sc.nextInt();
					
					progEv.addEvent(new Evento(evName, LocalDate.parse(evDate), evSeats));
					
					continue;
				}else {
					break;
				}
				
			} catch (Exception e) {
				System.err.println(e.getMessage());
				continue;
			}
		}
		System.out.println("La tua lista eventi: \n");
		
		for (String ev : progEv.getProgrammaEventi()) {
			
			System.out.println("\t" + ev + "\n");
			
		}	
		

			
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
