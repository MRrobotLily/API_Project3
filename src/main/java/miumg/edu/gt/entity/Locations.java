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


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="Locations")

public class Locations {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_Location")
	private long idLocation;
	@Column(name="location_Name")
	private String locationName;
	@Column (name="capacity")
	private int capacity;
	@Column (name="Location_Status")
	private String locationStatus;
	
	public long getIdLocation() {
		return idLocation;
	}
	public void setIdLocation(long idLocation) {
		this.idLocation = idLocation;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getLocationStatus() {
		return locationStatus;
	}
	public void setLocationStatus(String locationStatus) {
		this.locationStatus = locationStatus;
	}
	
}
