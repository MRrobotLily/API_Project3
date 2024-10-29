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
	@Column (name="Date_Time")
	private LocalDateTime dateAndTime;
	@Column (name="Status")
	private String status;
	@Column (name="id_Address")
	private long IdAddress;
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
	
	public LocalDateTime getdateAndTime() {
		return dateAndTime;
	}
	public void setdateAndTime(LocalDateTime DateAndTime) {
		dateAndTime = DateAndTime;
	}
	public String getstatus() {
		return status;
	}
	public void setstatus(String Status) {
		status = Status;
	}
	public long getIdAddress() {
		return IdAddress;
	}
	public void setIdAddress(long idAddress) {
		IdAddress = idAddress;
	}
	public long getidUser() {
		return idUser;
	}
	public void setidUser(long IdUser) {
		idUser = IdUser;
	}
}
