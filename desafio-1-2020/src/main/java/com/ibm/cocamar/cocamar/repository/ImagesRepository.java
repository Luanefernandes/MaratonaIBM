package com.ibm.cocamar.cocamar.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.cocamar.cocamar.model.Images;

public interface ImagesRepository extends JpaRepository<Images, Long> {
	public List<Images> findAllByDescricaoContainingIgnoreCase (String imagens);
}
