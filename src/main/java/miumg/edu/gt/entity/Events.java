package miumg.edu.gt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="Events")

public class Events {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_Event")
	private long idEvent;
	@Column(name="event_Name")
	private String eventName;
	@Column (name="event_created")
	private LocalDateTime eventCreated;
	@Column (name="date_Event")
	private Date dateEvent;
	@Column (name="time_Event")
	private LocalTime timeEvent;
	@Column (name="Status")
	private String status;
	@Column (name="id_Location")
	private long idLocation;
	@Column (name="Id_User")
	private long idUser;
	
	
	public long getIdEvent() {
		return idEvent;
	}
	public void setIdEvent(long idEvent) {
		this.idEvent = idEvent;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	public String getstatus() {
		return status;
	}
	public void setstatus(String Status) {
		status = Status;
	}
	public long getidLocation() {
		return idLocation;
	}
	public void setidLocation(long IdLocation) {
		idLocation = IdLocation;
	}
	public long getidUser() {
		return idUser;
	}
	public void setidUser(long IdUser) {
		idUser = IdUser;
	}
	public LocalDateTime getEventCreated() {
		return eventCreated;
	}
	public void setEventCreated(LocalDateTime eventCreated) {
		this.eventCreated = eventCreated;
	}
	public Date getDateEvent() {
		return dateEvent;
	}
	public void setDateEvent(Date dateEvent) {
		this.dateEvent = dateEvent;
	}
	public LocalTime getTimeEvent() {
		return timeEvent;
	}
	public void setTimeEvent(LocalTime timeEvent) {
		this.timeEvent = timeEvent;
	}
}
