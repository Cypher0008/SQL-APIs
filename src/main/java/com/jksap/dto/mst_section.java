package com.jksap.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity

public class mst_section {
	
	@Id
	@Column(name="section_id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer section_id;
	private String section_nm;
	
	public mst_section()
	{
		
	}

	public mst_section (Integer section_id, String section_nm) {
			
		super();
		this.section_id = section_id;
		this.section_nm = section_nm;
		
	}

	public Integer getSection_id() {
		return section_id;
	}

	public void setSection_id(Integer section_id) {
		this.section_id = section_id;
	}

	public String getSection_nm() {
		return section_nm;
	}

	public void setSection_nm(String section_nm) {
		this.section_nm = section_nm;
	}
	
}
