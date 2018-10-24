package io.icodetech.event.domain.command;

import java.io.Serializable;

import org.springframework.context.ApplicationEvent;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonCommandCreate implements Serializable {

	private static final long serialVersionUID = 2418478974347931913L;
	
	private Long id;
	private String name;
	private String cpf;
	
}
