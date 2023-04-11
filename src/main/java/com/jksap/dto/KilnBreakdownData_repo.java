package com.jksap.dto;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface KilnBreakdownData_repo extends JpaRepository<KilnBreakdownData, Integer>  {

	  	@Transactional
	    @Modifying
		@Query(value ="insert into kiln_breakdown(sn, frequency, section, equipment_code, fault, department, narration, hours, date) values(:sn, :frequency, :section, :equipment_code, :fault, :department, :narration, :hours, :date)", nativeQuery = true)
		void insertData(@Param("sn") Integer sn, @Param("frequency") Integer frequency, @Param("section") String section, @Param("equipment_code") String equipment_code,
				  @Param("fault") String fault, @Param("department") String department, @Param("narration") String narration, @Param("hours") Double hours, @Param("date") Date date);
	  
	 
	  
	
}
