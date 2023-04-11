package com.jksap.dto;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="grn_details")

public class GrnDetailsInputCloud {
	
	@Id
	@Column(name="grn_detail_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer grn_detail_id;
	
	private String grn,lot_no,grn_mic;
	
	public GrnDetailsInputCloud()
	{
		
	}
	
	
	public GrnDetailsInputCloud(String grn,String lot_no,String grn_mic)
	{
		super();
		this.grn=grn;
		this.lot_no=lot_no;
		this.grn_mic=grn_mic;
	}


	public Integer getGrn_detail_id() {
		return grn_detail_id;
	}


	public void setGrn_detail_id(Integer grn_detail_id) {
		this.grn_detail_id = grn_detail_id;
	}


	public String getGrn() {
		return grn;
	}


	public void setGrn(String grn) {
		this.grn = grn;
	}


	public String getLot_no() {
		return lot_no;
	}


	public void setLot_no(String lot_no) {
		this.lot_no = lot_no;
	}


	public String getGrn_mic() {
		return grn_mic;
	}


	public void setGrn_mic(String grn_mic) {
		this.grn_mic = grn_mic;
	}


	
	
	
    

}
