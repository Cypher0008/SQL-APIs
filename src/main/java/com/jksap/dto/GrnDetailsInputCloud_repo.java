package com.jksap.dto;

import java.util.List;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface GrnDetailsInputCloud_repo extends JpaRepository<GrnDetailsInputCloud,Integer>{

	//************ Select query for grn_details *******************
		@Query("SELECT b FROM GrnDetailsInputCloud b WHERE b.lot_no = :lot_no")
		List<GrnDetailsInputCloud> getGrnDetails(@Param("lot_no") String lot_no);
		
	
		//************ delete query for grn_details *******************
	    @Transactional
	    @Modifying
		@Query("delete from GrnDetailsInputCloud u where u.grn = :grn")
		void delete_GrnDetails(@Param("grn") String grn);
		

}
