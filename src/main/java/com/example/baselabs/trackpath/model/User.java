package com.example.baselabs.trackpath.model;

import java.util.List;
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

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String email;
	
	
	@OneToMany
	private Set<Category> category;

	@OneToMany
	private Set<Expence> expence;

}
