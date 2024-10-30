package miumg.edu.gt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import miumg.edu.gt.entity.Events;
import miumg.edu.gt.repository.EventsRepository;


@Service
public class EventServiceImpl implements EventService {
	
	@Autowired
	private EventsRepository eventsRepository;
	
	@Override
	public List<Events> getAllEvents() {
		return (List<Events>) eventsRepository.findAll();
	}

	@Override
	public Events getEventsById(Long EventsId) {
		return eventsRepository.findById(EventsId).get();
	}

	@Override
	public Events addEvents(Events events) {
		return eventsRepository.save(events);
	}

	@Override
	public Events updateEvents(Events events, Long EventsId) {
		Events EventsObj = eventsRepository.findById(EventsId).get();
		if (EventsObj != null) {
			EventsObj.setstatus(events.getstatus());
			EventsObj.setdateAndTime(events.getdateAndTime());
		}
		return eventsRepository.save(EventsObj);
	}

	@Override
	public String deleteEvents(Long EventsId) {
		Events EventsObj = eventsRepository.findById(EventsId).get();
		if (EventsObj != null) {
			eventsRepository.delete(EventsObj);
		}
		return "Evento eliminado con exito!";
	}
	@Override
	  public List<Events> getEventsByidUser(Long idUser) {
	        return eventsRepository.findByidUser(idUser);
	    }
}
