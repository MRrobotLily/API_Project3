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
@Table(name="Events")

public class Persons {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="id_Person")
		private long idPerson;
		@Column(name="Name")
		private String Name; 
		@Column(name="Last_Name")
		private String lastName;
		@Column (name="Contact_Number")
		private long contactNumber;
		@Column (name="Email")
		private String email;
		@Column (name="Gender")
		private String gender;
		@Column (name="Age")
		private long age;
		
		
		public long getidPerson() {
			return idPerson;
		}
		public void setidPerson(long IdPerson) {
			this.idPerson = IdPerson;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			this.Name = name;
		}
		
		public String lastName() {
			return lastName;
		}
		public void setlastName(String LastName) {
			lastName = LastName;
		}
		public long getcontactNumber() {
			return contactNumber;
		}
		public void setcontactNumber(long ContactNumber) {
			contactNumber = ContactNumber;
		}
		public String getemail() {
			return email;
		}
		public void setemail(String Email) {
			email = Email;
		}
		public String getgender() {
			return gender;
		}
		public void setgender(String Gender) {
			gender = Gender;
		}
		public long getage() {
			return age;
		}
		public void setage(long Age) {
			age = Age;
		}
}
