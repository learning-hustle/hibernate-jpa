package com.blackrabbit.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PincodeDetails { 

	@Id
	private Long id;
	@Column
	private String pincode;
	
}
