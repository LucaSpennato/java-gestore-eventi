package org.generation.italy.eventi;

import java.util.ArrayList;
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
	
	@Override
	public String toString() {

		return"Events title: " + getTitle()
				+ "\nEvents: " + getEvents();
	}
	
}

