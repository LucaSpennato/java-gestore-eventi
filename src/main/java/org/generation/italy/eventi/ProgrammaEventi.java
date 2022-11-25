package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProgrammaEventi {

	private String title;
	private List<Evento> events;
	
	public ProgrammaEventi(String title) {
		
		setTitle(title);
		setEvents();
		
	}

	public String getTitle() {
		return title;
	}
	private void setTitle(String title) {
		this.title = title;
	}

	public List<Evento> getEvents() {
		return events;
	}
	private void setEvents() {
		this.events = new ArrayList<>();
	}

	public void addEvent(Evento ev) {
		events.add(ev);
	}
	
	public int getEventsCount() {
		return events.size();
	}
	public void clearAllEvents() {
		events.clear();
	}
	
	public List<Evento> getEventsInDate(LocalDate d){
		
		List<Evento> listDate = new ArrayList<>();
		
		for (Evento event : events) {
			
			if(event.getDate().equals(d)) {
				listDate.add(event);
			}
			
		}
		
		return listDate;
		
	}
	
	public List<String> getProgrammaEventi(){
		
		List<String> programmedEvents = new ArrayList<>();
		
		programmedEvents.add(title);
		
		
		
		events.sort(new EventoDateComparator());
		
		for (Evento event : events) {
			
			String formattedEventInfo = event.getTitle() + " - " + event.getDate();
			programmedEvents.add(formattedEventInfo);
		}
		
		return programmedEvents;
		
	}
	
	private static class EventoDateComparator implements Comparator<Evento>{

		@Override
		public int compare(Evento o1, Evento o2) {
			
			if(o1.getDate().isAfter(o2.getDate())) {
				return 1;
			}else if(o2.getDate().isAfter(o1.getDate())) {
				return -1;
			}
			
			return 0;
		}
		
	}
	
	@Override
	public String toString() {

		return"Events title: " + getTitle()
				+ "\nEvents: " + getEvents();
	}
	
}

