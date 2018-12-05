package com.wynats.entity;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Todo {
	@Id
	private String id;

	private String title;
	private String description;
	

}
