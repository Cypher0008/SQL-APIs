package com.jksap.dto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface mst_plant_repo extends JpaRepository<mst_plant, Integer> {
	
	//************ Select query for UD1 *******************
	@Query("select b from mst_plant b")
	List<mst_plant> select_plantdata();

}
