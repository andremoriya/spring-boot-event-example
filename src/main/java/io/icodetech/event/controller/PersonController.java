package io.icodetech.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.icodetech.event.domain.command.PersonCommandCreate;
import io.icodetech.event.domain.command.PersonCommandDelete;
import io.icodetech.event.domain.command.PersonCommandUpdate;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private ApplicationEventPublisher event;
	
	@PostMapping("/create")
	public void create(@RequestBody PersonCommandCreate create) {
		
		event.publishEvent(create);
		System.out.println(create.getId());
	}
	
	@PutMapping("/update")
	public void update(@RequestBody PersonCommandUpdate create) {
		
		event.publishEvent(create);
		System.out.println(create.getCpf());
		
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody PersonCommandDelete create) {
		
		event.publishEvent(create);
		System.out.println(create.getId());
		
	}
}
