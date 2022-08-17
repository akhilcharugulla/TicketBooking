package com.info.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.info.entities.TicketEntity;
import com.info.service.TicketService;

@SpringBootApplication
@EntityScan("com.info.entities")
@EnableJpaRepositories("com.info")
@ComponentScan(basePackages = {"com.info.controller","com.info.service"})
public class TicketbookingApplication{
	private static ConfigurableApplicationContext applicationContext;
	public static void main(String[] args) {
	 applicationContext = SpringApplication.run(TicketbookingApplication.class, args);
		TicketService ticketService = applicationContext.getBean("ticketService",TicketService.class);
		  TicketEntity ticket = new TicketEntity("akhil","gmail.com",new Date(),"bdcr","sc");
//		  ticket.setTicketId(1);
//		  ticket.setPersonName("charu");
//		  ticket.setEmail("akhil@gmail.com");
//		  ticket.setSource("bdcr");
//		  ticket.setDestination("sc");
//		  ticket.setBookingDate(new Date());
		  System.out.println(ticket);
		  ticketService.createTicket(ticket);
//		  Logger lo = LoggerFactory.getLogger(SpringBootApplication.class);
		  List<TicketEntity>tickets= Arrays.asList(new TicketEntity("lik","@gmail.com",new Date(),"der","oop"),new TicketEntity("akhil","gmail.com",new Date(),"bdcr","sc"));
		  Iterable<TicketEntity> ourtickets =ticketService.addTickets(tickets);
		  for(TicketEntity t:ourtickets) {
			  System.out.println(t);
		  }
	}

}
 