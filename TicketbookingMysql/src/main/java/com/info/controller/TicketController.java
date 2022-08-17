package com.info.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.info.entities.TicketEntity;
import com.info.service.TicketService;

@RestController
@RequestMapping(value="/api/tickets")
public class TicketController {
	@Autowired
	TicketService tService;
	@PostMapping(value="/create")
	public TicketEntity createTicket(@RequestBody TicketEntity ticket) {
		return tService.createTicket(ticket);
	}
	@GetMapping("/ticket/{ticketId}")
	public TicketEntity getTicketById(@PathVariable("ticketId") Integer ticketId) {
		return tService.getTicketById(ticketId);	
	}
	@DeleteMapping("/ticket/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId) {
		 tService.deleteTicket(ticketId);
	}
	@GetMapping("/ticket/alltickets") 
	public List<TicketEntity> getAllTickets(){
		return tService.getAllTickets();
	}
	@PutMapping("/ticket/{ticketId}/{updatedEmail:.+}")
	public TicketEntity updateTicket(@PathVariable("ticketId") Integer ticketId,@PathVariable("updatedEmail")String updatedEmail ) {
		return tService.updateTicket(ticketId,updatedEmail);	
	}
}
