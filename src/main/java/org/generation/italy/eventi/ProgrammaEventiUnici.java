package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProgrammaEventiUnici {

	private String title;
	private Set<Evento> events;
	
	public ProgrammaEventiUnici(String title) {
		
		setTitle(title);
		setEvents();
		
	}

	public String getTitle() {
		return title;
	}
	private void setTitle(String title) {
		this.title = title;
	}

	public Set<Evento> getEvents() {
		return events;
	}
	private void setEvents() {
		this.events = new HashSet<>();
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
		
		
		for (Evento event : events) {
			
			String formattedEventInfo = event.getTitle() + " - " + event.getDate();
			programmedEvents.add(formattedEventInfo);
		}
		
		programmedEvents.sort((o1,o2)-> o1.length() - o2.length());
		
		return programmedEvents;
		
	}
	
	public int getMaxPostiTotali() {
		
		int maxValue = Integer.MIN_VALUE;
		
		for (Evento evento : events) {
			if(maxValue < evento.getTotalSeats()) {
				maxValue = evento.getTotalSeats();
			}
		}
		return maxValue;
	}
	
public int getMinPostiTotali() {
		
		int minValue = Integer.MAX_VALUE;
		
		for (Evento evento : events) {
			if(minValue > evento.getTotalSeats()) {
				minValue = evento.getTotalSeats();
			}
		}
		return minValue;
	}
	
	@Override
	public String toString() {

		return"Events title: " + getTitle()
				+ "\nEvents: " + getEvents();
	}
	
}
