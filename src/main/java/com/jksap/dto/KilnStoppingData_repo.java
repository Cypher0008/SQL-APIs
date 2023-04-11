package com.jksap.dto;

import java.time.LocalTime;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface KilnStoppingData_repo extends JpaRepository<KilnStoppingData, Integer>  {
	
	@Transactional
    @Modifying
	@Query(value ="insert into kiln_stopping(plant,frequency, position, posting_date,\n" + 
			"	equipment_no, equipment_description, tech_id, damage_code_group,\n" + 
			"	 damage_code, reason_for_breakdown, idle_code_group, idle_code, reason_for_idle\n" + 
			"	, effect_type, stoppage_details, stop_date, start_date, breakdown_hours, idle_hours\n" + 
			"	, stop_time, start_time) values(:plant, :frequency, :position, :posting_date,\n" + 
			"	:equipment_no, :equipment_description, :tech_id, :damage_code_group,\n" + 
			"	 :damage_code, :reason_for_breakdown, :idle_code_group, :idle_code, :reason_for_idle\n" + 
			"	, :effect_type, :stoppage_details, :stop_date, :start_date, :breakdown_hours, :idle_hours\n" + 
			"	, :stop_time, :start_time)", nativeQuery = true)
	void insertData(@Param("plant") String plant,@Param("frequency") Integer frequency, @Param("position") String position, @Param("posting_date") Date posting_date,
			@Param("equipment_no") String equipment_no, @Param("equipment_description") String equipment_description, @Param("tech_id") String tech_id, @Param("damage_code_group") String damage_code_group,
			@Param("damage_code") String damage_code, @Param("reason_for_breakdown") String reason_for_breakdown, @Param("idle_code_group") String idle_code_group, @Param("idle_code") String idle_code, @Param("reason_for_idle") String reason_for_idle 
			, @Param("effect_type") String effect_type, @Param("stoppage_details") String stoppage_details, @Param("stop_date") Date stop_date, @Param("start_date") Date start_date, @Param("breakdown_hours") Double breakdown_hours, @Param("idle_hours") Double idle_hours 
			, @Param("stop_time") LocalTime stop_time, @Param("start_time") LocalTime start_time);
	
	
	

}