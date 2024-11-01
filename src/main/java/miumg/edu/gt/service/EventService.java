package miumg.edu.gt.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import miumg.edu.gt.entity.Events;

public interface EventService {

	List<Events> getAllEvents();
	Events getEventsById(Long EventsId);
	Events addEvents(Events events);
	Events updateEvents(Events events, Long EventsId);
	String deleteEvents(Long EventsId);
	List<Events> getEventsByidUser(Long idUser);
	String createOrUpdateEvent(Events event);
	boolean isLocationAndDateEventReserved(Long idLocation, LocalDate dateEvent);
}
