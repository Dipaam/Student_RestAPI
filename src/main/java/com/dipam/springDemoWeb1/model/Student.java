package com.dipam.springDemoWeb1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {
	@Id
	private int roll;
	private String name;
}
