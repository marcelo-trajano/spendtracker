package com.example.baselabs.trackpath.model;

import java.time.Instant;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="expence")
public class Expence {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String description;
	
	private Instant date;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Category category;
	

}
