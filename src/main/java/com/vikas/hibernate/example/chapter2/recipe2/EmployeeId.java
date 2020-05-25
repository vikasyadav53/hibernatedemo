package com.vikas.hibernate.example.chapter2.recipe2;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public final class EmployeeId implements Serializable {

	private Long department;

	private Long idCard;
	
	public EmployeeId() {
		
	}

	public EmployeeId(Long department, Long idCard) {
		this.department = department;
		this.idCard = idCard;
	}

}
