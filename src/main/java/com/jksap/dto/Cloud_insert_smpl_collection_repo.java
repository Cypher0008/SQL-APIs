package com.jksap.dto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface Cloud_insert_smpl_collection_repo extends JpaRepository<Cloud_insert_smpl_collection, Integer>{
	
	        //************ Select query for Cancel_gateEntryData *******************
			@Query("SELECT b FROM Cloud_insert_smpl_collection b WHERE  b.is_sent='false'")
			List<Cloud_insert_smpl_collection> select_cloudsmplcollection();
		
	
	
	

}
