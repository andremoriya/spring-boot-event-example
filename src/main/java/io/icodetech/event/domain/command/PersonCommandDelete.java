package io.icodetech.event.domain.command;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonCommandDelete implements Serializable {

	private static final long serialVersionUID = 7411683940930524843L;
	
	private Long id;
	
}
