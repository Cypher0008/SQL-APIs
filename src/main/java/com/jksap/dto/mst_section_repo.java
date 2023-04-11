package com.jksap.dto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface mst_section_repo  extends JpaRepository<mst_section, Integer>{
	
	@Query("SELECT b FROM mst_section b")
	List<mst_section> select_mst_sectiondata();

}
