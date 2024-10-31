package miumg.edu.gt.entity;

import java.time.LocalTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="Reservation")

public class Reservation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_Reservation")
	private long idReservation;
	@Column (name="date_Event")
	private Date dateEvent;
	@Column (name="time_Event")
	private LocalTime timeEvent;
	@Column(name="id_Location")
	private long idLocation;
	@Column(name="reservaton_Status")
	private String reservationStatus;
	@Column(name="id_Event")
	private long idEvent;
	
	public long getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(long idReservation) {
		this.idReservation = idReservation;
	}
	public long getIdLocation() {
		return idLocation;
	}
	public void setIdLocation(long idLocation) {
		this.idLocation = idLocation;
	}
	public String getReservationStatus() {
		return reservationStatus;
	}
	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}
	public long getIdEvent() {
		return idEvent;
	}
	public void setIdEvent(long idEvent) {
		this.idEvent = idEvent;
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
