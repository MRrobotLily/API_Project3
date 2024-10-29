package miumg.edu.gt.service;

import java.util.List;

import miumg.edu.gt.entity.Events;

public interface EventService {

	List<Events> getAllEvents();
	Events getEventsById(Long EventsId);
	Events addEvents(Events events);
	Events updateEvents(Events events, Long EventsId);
	String deleteEvents(Long EventsId);
}
