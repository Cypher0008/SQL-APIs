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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="kiln_breakdown")
@IdClass(KilnBreakdownData.class)
public final class KilnBreakdownData implements Serializable {
	
	@Id
	@Column(name="kiln_breakdown_id",insertable=false, updatable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer kiln_breakdown_id,sn,frequency;
	private String section,equipment_code,fault,department,narration,jam;
	private Double hours;
	private Date date;
	public Integer getSn() {
		return sn;
	}
	public void setSn(Integer sn) {
		this.sn = sn;
	}
	public Integer getFrequency() {
		return frequency;
	}
	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getEquipment_code() {
		return equipment_code;
	}
	public void setEquipment_code(String equipment_code) {
		this.equipment_code = equipment_code;
	}
	public String getFault() {
		return fault;
	}
	public void setFault(String fault) {
		this.fault = fault;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getNarration() {
		return narration;
	}
	public void setNarration(String narration) {
		this.narration = narration;
	}
	public String getJam() {
		return jam;
	}
	public void setJam(String jam) {
		this.jam = jam;
	}
	public Double getHours() {
		return hours;
	}
	public void setHours(Double hours) {
		this.hours = hours;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	
	public KilnBreakdownData() {
		
	}
	
	public KilnBreakdownData(Integer kiln_breakdown_id,Integer sn,Integer frequency,String section,String equipment_code,
			String fault,String department,String narration,String jam,Double hours,Date date)
	{
		super();
		this.kiln_breakdown_id=kiln_breakdown_id;
		this.sn= sn;
		this.frequency=frequency;
		this.section=section;
		this.equipment_code=equipment_code;
		this.fault=fault;
		this.department=department;
		this.narration=narration;
		this.jam=jam;
		this.hours=hours;
		this.date=date;
	}

}
