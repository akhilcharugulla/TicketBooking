package com.info.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.info.dao.TicketDao;
import com.info.entities.TicketEntity;
@Service
public class TicketService {
    @Autowired
	private TicketDao ticketDao ;
//public TicketService(TicketDao ticketDao){
//	 this.ticketDao=ticketDao ;
//}
	public TicketEntity createTicket( TicketEntity ticket) {
		return ticketDao.save(ticket);
	}
	public TicketEntity getTicketById(Integer ticketId) {
		System.out.println(ticketId);
		return ticketDao.findById(ticketId).get();
	}
	public void deleteTicket(Integer ticketId) {
		System.out.println(ticketId);
		ticketDao.deleteById(ticketId);
	}
	public List<TicketEntity> getAllTickets() {
		return  (List<TicketEntity>) ticketDao.findAll();
	}
	public TicketEntity updateTicket(Integer ticketId, String updatedEmail) {
		TicketEntity ticketFromdB=ticketDao.findById(ticketId).get();
		ticketFromdB.setEmail(updatedEmail);
		return ticketDao.save(ticketFromdB);
		
	}
	public Iterable<TicketEntity> addTickets(List<TicketEntity> tickets) {
		Iterable<TicketEntity> ticks = ticketDao.saveAll(tickets);
		return ticks; 
	}
}
