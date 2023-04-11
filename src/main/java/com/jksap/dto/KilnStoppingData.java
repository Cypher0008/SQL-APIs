package com.jksap.dto;




import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement; 


@XmlRootElement
@Entity
@Table(name="kiln_stopping")
@IdClass(KilnStoppingData.class)
//public class KilnStoppingData
public final class KilnStoppingData implements Serializable{
	
	@Id
	@Column(name="kiln_stopping_id",insertable=false, updatable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer kiln_stopping_id,frequency;
	private String position,equipment_no,equipment_description,tech_id,damage_code_group,
	damage_code,reason_for_breakdown,idle_code_group,idle_code,reason_for_idle,effect_type,stoppage_details,plant;
	private Date stop_date,start_date,posting_date;
	private Double breakdown_hours,idle_hours;
	private LocalTime stop_time,start_time;
	
	public Integer getFrequency() {
		return frequency;
	}
	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getEquipment_no() {
		return equipment_no;
	}
	public void setEquipment_no(String equipment_no) {
		this.equipment_no = equipment_no;
	}
	public String getEquipment_description() {
		return equipment_description;
	}
	public void setEquipment_description(String equipment_description) {
		this.equipment_description = equipment_description;
	}
	public String getTech_id() {
		return tech_id;
	}
	public void setTech_id(String tech_id) {
		this.tech_id = tech_id;
	}
	public String getDamage_code_group() {
		return damage_code_group;
	}
	public void setDamage_code_group(String damage_code_group) {
		this.damage_code_group = damage_code_group;
	}
	public String getDamage_code() {
		return damage_code;
	}
	public void setDamage_code(String damage_code) {
		this.damage_code = damage_code;
	}
	public String getReason_for_breakdown() {
		return reason_for_breakdown;
	}
	public void setReason_for_breakdown(String reason_for_breakdown) {
		this.reason_for_breakdown = reason_for_breakdown;
	}
	public String getIdle_code_group() {
		return idle_code_group;
	}
	public void setIdle_code_group(String idle_code_group) {
		this.idle_code_group = idle_code_group;
	}
	public String getIdle_code() {
		return idle_code;
	}
	public void setIdle_code(String idle_code) {
		this.idle_code = idle_code;
	}
	public String getReason_for_idle() {
		return reason_for_idle;
	}
	public void setReason_for_idle(String reason_for_idle) {
		this.reason_for_idle = reason_for_idle;
	}
	public String getEffect_type() {
		return effect_type;
	}
	public void setEffect_type(String effect_type) {
		this.effect_type = effect_type;
	}
	public String getStoppage_details() {
		return stoppage_details;
	}
	public void setStoppage_details(String stoppage_details) {
		this.stoppage_details = stoppage_details;
	}
	public Date getStop_date() {
		return stop_date;
	}
	public void setStop_date(Date stop_date) {
		this.stop_date = stop_date;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Double getBreakdown_hours() {
		return breakdown_hours;
	}
	public void setBreakdown_hours(Double breakdown_hours) {
		this.breakdown_hours = breakdown_hours;
	}
	public Double getIdle_hours() {
		return idle_hours;
	}
	public void setIdle_hours(Double idle_hours) {
		this.idle_hours = idle_hours;
	}
	public LocalTime getStop_time() {
		return stop_time;
	}
	public void setStop_time(LocalTime stop_time) {
		this.stop_time = stop_time;
	}
	public LocalTime getStart_time() {
		return start_time;
	}
	public void setStart_time(LocalTime start_time) {
		this.start_time = start_time;
	}
		
	public Date getPosting_date() {
		return posting_date;
	}
	public void setPosting_date(Date posting_date) {
		this.posting_date = posting_date;
	}
		
	public String getPlant() {
		return plant;
	}
	public void setPlant(String plant) {
		this.plant = plant;
	}
	public KilnStoppingData() {
		
		
	}
	
	
	public KilnStoppingData(Integer kiln_stopping_id,String plant,Integer frequency,String position,Date posting_date,
			String equipment_no,String equipment_description,String tech_id,String damage_code_group,
			String damage_code,String reason_for_breakdown,String idle_code_group,String idle_code,String reason_for_idle
			,String effect_type,String stoppage_details,Date stop_date,Date start_date,Double breakdown_hours,Double idle_hours
			,LocalTime stop_time,LocalTime start_time)
	{
			super();
			this.kiln_stopping_id=kiln_stopping_id;
			this.plant=plant;
			this.frequency=frequency;
			this.position=position;
			this.posting_date=posting_date;
			this.equipment_no=equipment_no;
			this.equipment_description=equipment_description;
			this.tech_id=tech_id;
			this.damage_code_group= damage_code_group;
			this.damage_code=damage_code;
			this.reason_for_breakdown=reason_for_breakdown;
			this.idle_code_group=idle_code_group;
			this.idle_code=idle_code;
			this.reason_for_idle=reason_for_idle;
			this.effect_type=effect_type;
			this.stoppage_details=stoppage_details;
			this.stop_date=stop_date;
			this.start_date=start_date;
			this.breakdown_hours=breakdown_hours;
			this.idle_hours=idle_hours;
			this.stop_time=stop_time;
			this.start_time=start_time;
		
	}



}

