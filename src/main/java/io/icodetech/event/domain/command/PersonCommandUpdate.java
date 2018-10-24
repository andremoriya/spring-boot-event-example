package io.icodetech.event.domain.command;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonCommandUpdate implements Serializable {

	private static final long serialVersionUID = -5941583849074799797L;
	
	private Long id;
	private String name;
	private String cpf;
	
}
