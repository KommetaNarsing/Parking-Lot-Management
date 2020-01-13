package com.parkingSystem.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

	@GetMapping(path = "/NextTicket")
	public String getTicket(){
		return "Ticket";
	}
}
