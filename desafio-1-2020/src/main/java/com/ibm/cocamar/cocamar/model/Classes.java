package com.ibm.cocamar.cocamar.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table (name="db_classe")
public class Classes {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String classes;
	
	@NotNull
	private float score;
	
	@NotNull
	private String type_hierarchy;
	
	@OneToMany(mappedBy = "classes", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("classes")
	private List <Images> images;

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public String getType_hierarchy() {
		return type_hierarchy;
	}

	public void setType_hierarchy(String type_hierarchy) {
		this.type_hierarchy = type_hierarchy;
	}
	
}
