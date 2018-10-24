package io.icodetech.event.domain;

import java.util.UUID;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import io.icodetech.event.domain.command.PersonCommandCreate;
import io.icodetech.event.domain.command.PersonCommandDelete;
import io.icodetech.event.domain.command.PersonCommandUpdate;

@Component
public class PersonListener {

	@EventListener
	public void onCreate(PersonCommandCreate create) {
		create.setId(UUID.randomUUID().getMostSignificantBits());
		System.out.println(create.getName());
	}
	
	@EventListener
	public void onUpdate(PersonCommandUpdate update) {
		System.out.println(update.getName());
		update.setCpf("0123456789");
	}
	
	@EventListener
	public void onDelete(PersonCommandDelete delete) {
		System.out.println(delete.getId());
		delete.setId(null);
	}
	
}
