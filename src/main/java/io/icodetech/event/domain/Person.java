package io.icodetech.event.domain;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE, staticName = "of")
@AllArgsConstructor(access = AccessLevel.PRIVATE, staticName = "of")
public class Person implements Serializable{

	private static final long serialVersionUID = -4363448589372625431L;
	
	private Long id;
	private String name;
	private String cpf;
	
}