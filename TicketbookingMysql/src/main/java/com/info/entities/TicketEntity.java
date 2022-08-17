package com.info.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ticket")
public class TicketEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Integer ticketId;
private String personName;
private String email;
private Date bookingDate;
private String source;
private String destination;
public TicketEntity() {
}

public TicketEntity(String personName, String email, Date bookingDate, String source,
		String destination) {
	this.personName = personName;
	this.email = email;
	this.bookingDate = bookingDate;
	this.source = source;
	this.destination = destination;
}

public Integer getTicketId() {
	return ticketId;
}
public void setTicketId(Integer ticketId) {
	this.ticketId = ticketId;
}
public String getPersonName() {
	return personName;
}
public void setPersonName(String personName) {
	this.personName = personName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Date getBookingDate() {
	return bookingDate;
}
public void setBookingDate(Date bookingDate) {
	this.bookingDate = bookingDate;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
@Override
public String toString() {
	return "TicketEntity [ticketId=" + ticketId + ", personName=" + personName + ", email=" + email + ", bookingDate="
			+ bookingDate + ", source=" + source + ", destination=" + destination + "]";
}
}
