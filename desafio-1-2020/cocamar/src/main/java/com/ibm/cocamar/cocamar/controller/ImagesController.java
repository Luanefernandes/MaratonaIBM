package com.ibm.cocamar.cocamar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.cocamar.cocamar.model.Images;
import com.ibm.cocamar.cocamar.repository.ImagesRepository;

@RestController
@CrossOrigin(origins="*", allowedHeaders= "*")
@RequestMapping("/images")
public class ImagesController {
	
	@Autowired
	private ImagesRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Images>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}

}
